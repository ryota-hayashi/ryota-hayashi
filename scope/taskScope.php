<?php
    function randomRecursiveCalc(int $num)
    {
        $array = [];
        for($i = 0; $i < $num; $i++)
        {
            $array[$i] = rand(1, 100);
        }
        return $array;
    }
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskScope</title>
</head>
<body>
    <p><?php
        $array = randomRecursiveCalc(rand(1, 15));
    ?>  
    <table border=1>                                        <!--課題2-->
    <?php
        $cnt = 0;
        $total = 0;
    ?>
    <?php foreach($array as $key => $value) { ?>
        <tr>
        <td><?= $key + 1?></td>
        <td><?= $value?></td>
        <tr>
    <?php 
        $cnt++;
        $total += $value;
    }?>
    <p><?php
        echo("処理回数: " . $cnt . "<br>");
        echo("合計: " . $total . "<br>");
    ?></p>
</body>
</html>