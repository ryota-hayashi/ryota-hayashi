<?php
    $japanAverageSalaryArray = [        //課題1の配列変数
        2014 => 4410000,
        2015 => 4320000,
        2016 => 4220000,
        2017 => 4200000,
        2018 => 4150000
    ];
    $score = [        //課題2の配列変数
        'A' => 80,
        'B' => 55,
        'C' => 61,
        'D' => 76,
        'E' => 34,
        'F' => 93
    ];
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskArray</title>
</head>
<body>
    <p><?php                                        //課題1-1
            echo("<pre>");
            var_dump($japanAverageSalaryArray);
            echo("</pre>");
    ?></p>
    <p><?php                                        //課題1-2
            echo(array_sum($japanAverageSalaryArray) / count($japanAverageSalaryArray, COUNT_RECURSIVE));
    ?></p>
    <p><?php                                        //課題2-1
            echo("<pre>");
            var_dump($score);
            echo("</pre>");
    ?></p>
    <p><?php                                        //課題2-2
            echo(array_sum($score) / count($score, COUNT_RECURSIVE));
            var_dump(count($score, COUNT_RECURSIVE));
    ?></p>
</body>
</html>