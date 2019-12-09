<?php
    $score = [
        "boyA" => [
            "japanese"=> 85,
            "math" => 64,
            "society" => 45,
            "science" => 77,
            "english" => 80
        ],
        "boyB" => [
            "japanese"=> 56,
            "math" => 89,
            "society" => 73,
            "science" => 85,
            "english" => 78
        ],
        "boyC" => [
            "japanese"=> 98,
            "math" => 87,
            "society" => 88,
            "science" => 92,
            "english" => 96
        ]
    ]
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskAssociativeArray</title>
</head>
<body>
    <p><?php echo('A君の理科の点数は' . $score["boyA"]["science"] . '点です。'); ?></p>
    <p><?php echo('B君の英語の点数は' . $score["boyB"]["english"] . '点です。'); ?></p>
    <p><?php echo('A君の平均点は' . array_sum($score["boyA"]) / count($score["boyA"]) . '点です。'); ?></p>
    <p><?php echo('C君の平均点は' . array_sum($score["boyC"]) / count($score["boyC"]) . '点です。'); ?></p>
    <p><?php echo('3人の数学の平均点は' . (($score["boyA"]["math"] + $score["boyB"]["math"] + $score["boyC"]["math"]) / 3) . '点です'); ?></p>
</body>
</html>