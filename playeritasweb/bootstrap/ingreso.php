<?php
	include ('conexion.php');

session_start();

function login($mensaje)
{
  echo <<<EOD
  <body style="font-family: Arial, sans-serif;">

  <h2>Inicio de Sesion</h2>
  <p>$mensaje</p>
  <form action="ingreso.php" method="POST">
    <p>Usuario:    <input type="text" name="usuario"></p>

    <p>Contrasena: <input type="password" name="pass"</p>
    <br><br>
    <input type="submit" value="Enviar">
  </form>
  
  </body>
EOD;
}

if (!isset($_POST['usuario']) || !isset($_POST['pass'])) {
  login ('Inicio de sesion');
} else {
  // Check validity of the supplied usuario & pass
  
  // Use a "bootstrap" identifier for this administration page
  oci_set_client_identifier($conn, 'admin');

  $s = oci_parse($conn, 'select persona_idpersona
                      from   cliente 
                      where  persona_idpersona = :usu
                      and    passcliente = :pas');
  oci_bind_by_name($s, ":usu", $_POST['usuario']);
  oci_bind_by_name($s, ":pas", $_POST['pass']);
  oci_execute($s);
  $r = oci_fetch_array($s, OCI_ASSOC);

  if ($r) {
    // The pass matches: the user can use the application

    // Set the user name to be used as the client identifier in
    // future HTTP requests:
    $_SESSION['usuario'] = $_POST['usuario'];

    echo <<<EOD
    <body style="font-family: Arial, sans-serif;">

    <h2>Bienvenido a Playeritas</h2>
    <p><a href="index.php">lo que sea</a></p>
    </body>
EOD;
    exit;
  }
  else {
    // No rows matched so login failed
    login('Fallo el inicio. Datos invalidos ' );
              
  }
}

?>
