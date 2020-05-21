<?php

$servername = "sql313.epizy.com";
$username = "epiz_25763085";
$password ="DDqjh4zscdcUL0G";
$dbname = "epiz_25763085_taotlused";

$conns = mysqli_connect($servername,$username,$password,$dbname);

echo $conns ? 'connected' : 'not connected';
?>