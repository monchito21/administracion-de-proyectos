<?php
	$user = "scrum";
	$pass = "scrum";
	$db = "xe";

	$conn = OCI_connect($user, $pass, $db);
	if (!$conn) {
    	$e = oci_error();
	    trigger_error(htmlentities($e['message'], ENT_QUOTES), E_USER_ERROR);
	}
?>