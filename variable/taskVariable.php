<?php
    $apple = 110;
    $orange = 80;
    $appleNum = 15;
    $orangeNum = 12;
    $appleTotal = $apple * $appleNum;
    $orangeTotal = $orange * $orangeNum;
    $fruitsTotal = $appleTotal + $orangeTotal;
    const TAX = 1.1;
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskVariable</title>
</head>
<body>
    <p><?php echo('りんごの総額は '.$appleTotal.'円 です。'); ?></p>
    <p><?php echo('オレンジの総額は '.$orangeTotal.'円 です。'); ?></p>
    <p><?php echo('総額(税抜)は '.$fruitsTotal.'円 です。'); ?></p>
    <p><?php echo('総額(税込)は '.($fruitsTotal * TAX).'円 です。'); ?></p>
    <p><?php echo('フルーツ1個あたりの金額(税抜)は '.round($fruitsTotal / ($appleNum + $orangeNum)).'円 です。'); ?></p>
</body>
</html>