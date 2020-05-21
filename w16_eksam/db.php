<?php

$connection = mysqli_connect('sql313.epizy.com','epiz_25763085') or die(mysqli_error());
$database = mysqli_select_db('epiz_25763085_taotlused') or die(mysqli_error());

echo $connection ? 'connected' : 'not connected';
?>