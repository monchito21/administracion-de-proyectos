<?php 
	include('conexion.php');
	$tipoproducto = oci_parse($conn, 'select * from tipoproducto ');
	oci_execute($tipoproducto);
	$producto=oci_parse($conn, 'select * from producto');
	oci_execute($producto);
 ?>


<!DOCTYPE html>
<html>
<head>
	<link  href="css/estilos.css" rel="stylesheet">
</head>

<body>
	<div class="cabezera"> <a href="index.php">Inicio></a>  |   <a href="cerrarsesion.php">Cerrar Sesion</a>   | Anadir a carrito
	<div class="carrito"><img src="img/carrito.png" width="20"></div>
	</div>
	<div class="contenedor">
		
	<?php 
	while(($filas=oci_fetch_assoc($tipoproducto))!= false){
		$tipo=$filas['TIPO'];
		$idtip=$filas['IDTIPO'];
		$band=0;
		while(($band==0)&&(($filas1=oci_fetch_assoc($producto))!= false)) {
			$idtipop=$filas1['TIPOPRODUCTO_IDTIPO'];
			if($idtipop=$idtip){
				$precio=$filas1['PRECIO'];
				$idproducto=$filas1['IDPRODUCTO'];
				$band=1;
			}
		}
	?>
	<div class="caja">
		<h2><?php echo $tipo ?> </h2>
		<img src="<?php echo "img/".$tipo.".png"?> " width="100" height= "70" >
		<p><?php  echo "$".$precio.".0" ?> 	</p>
		<p><?php echo "ID #".$idproducto ?> 	</p>

		
	</div>
	<?php 
	}
 ?>
</div>
</body>
</html>