<?php


$subName = $_POST['subName'];
$subDate = $_POST['subDate'];
$description = $_POST['description'];



if(!empty($subName) || !empty($description) ) {

    $servername = "sql313.epizy.com";
    $username = "epiz_25763085";
    $password ="DDqjh4zscdcUL0G";
    $dbname = "epiz_25763085_lectures";

    $conn = mysqli_connect($servername,$username,$password,$dbname);

    if($conn -> connect_errno){
        echo "Probleem yhendusega";
        exit();
    } else {
        $SELECT = "SELECT subject_id FROM lectures WHERE subject_id = ? LIMIT 1";
        $INSERT = "INSERT INTO lectures (subject, date, description) values(?,?,?)";
        $testasi = null;
        //preparing
        $stmt = $conn->prepare($SELECT);
        echo $stmt;
        if($stmt == true){
            $stmt->bind_param("i", $testasi);
            $stmt->execute();
            $stmt->bind_result($testasi);
            $stmt->store_result();
            $rnum = $stmt->num_rows;
        } else { 
            $stmt = $conn->prepare($INSERT);
            echo $conn -> error;
            $stmt->bind_param("sss", $subName, $subDate, $description);
            
            $stmt->execute();
            echo "Sisestus õnnestus!";
            header("Location: index.php");
        }
        
        
        /*if($rnum == 0) {
            //$stmt->close();
            $stmt = $conn->prepare($INSERT);
            $date=date("d/m/y");
            $stmt->bind_param("sss", $subName, $subDate, $description);
            $stmt->execute();
            echo "Sisestus õnnestus!";
        } else {
            echo "Miski on valesti.";
        }*/
        $stmt->close();
        $conn->close();

    }
} else {
    echo "Täitmata lyngad!";
    die();
}


?>