<!DOCTYPE html>
<html>
<head>
	<title>Playeritas</title>
	<link rel="stylesheet" type="text/css" href="css/estilos.css">
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css">
	
</head>


<?php 
    include ('conexion.php');

session_start();

function login($mensaje)
{
  echo <<<EOD
  <body>

  <h2>Inicio de Sesion </h2>
  <p>$mensaje</p>
  <form action="index.php" method="POST">
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
    // Paso el inicio de sesion, ya puede usar la aplicacion

    // Asignamos el usuario como el cliente para ser usado en futuras referencias HTTP

    $_SESSION['usuario'] = $_POST['usuario'];

    echo <<<EOD
    <body BGCOLOR="DARKBLUE">
    <div class="cabezera"> <a href="index.php">Inicio></a>  |   <a href="cerrarsesion.php">Cerrar Sesion</a>   |  Anadir al carrito 
  <div class="carrito"><img src="img/carrito.png" width="20"></div>
  </div>
    <h2>Bienvenido a Playeritas</h2>
    <p><a href="catalogo.php">Visitar el catalogo</a><p>
    </body>
EOD;
    exit;
  }
  else {
    // Cuadros llenar, fallo de inicio de sesion.
    login('Fallo el inicio. Datos invalidos ' );
              
  }
}
?>
	

</html>
