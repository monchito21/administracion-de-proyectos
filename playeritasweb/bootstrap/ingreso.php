<?php
	include ("conexion.php");

	$conn = ocilogon($user, $pass, $db);

	if(!$conn){
		echo "Conexion es invalida" . var_dump (OCIError() );
		die();
	}

	$var2 = $_POST["suministro"];
	$var1 = $_POST["id_suministro"];

	$query = OCIParse($conn, "insert into SUMINISTRO values (:dato1, :dato2)");
	ocibindbyname($query, ":dato1", $var1);
	oscibinbyname($query, ":dato2", $var2);
	osciexecute($query, OCI_default);

	ocicommit($conn);
	ocilogoff($conn);
?>