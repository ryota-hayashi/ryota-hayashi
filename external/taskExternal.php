<?php
    $num1 = 84;
    $num2 = 37;
    $averageScore = [                               //各科目の平均点
        'nationalLanguage' => 63,
        'math' => 67,
        'society' => 71,
        'science' => 68,
        'english' => 66,
    ];
    $AScore = [                             //Aくんの点数
        'nationalLanguage' => 76,
        'math' => 72,
        'society' => 65,
        'science' => 68,
        'english' => 80,
    ];
    $subjectTitle = [                               //各科目名
        'nationalLanguage' => '国語',
        'math' => '数学',
        'society' => '社会',
        'science' => '理科',
        'english' => '英語',
    ];
    require_once("externalFunctions.php");
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskExternal</title>
</head>
<body>
    <p><?php                                        //課題1
        $plus = calcNumber($num1, $num2, true);
        echo("1. " . $plus . "<br>");
        $minus = calcNumber($num1, $num2, false);
        echo("2. " . $minus);
    ?></p>
    <p><?php                                        //課題2
        $result1 = $exponentiation($num1, true);
        echo("1. " . $result1 . "<br>");
        $result2 = $exponentiation($num2, false);
        echo("2. " . $result2);
    ?></p>
    <p><?php                                        //課題3-1
        $average = calcAverage($averageScore);
        echo("1. 全科目の平均点は " . $average . " 点です<br>");
        $AScoreAverage = calcAverage($AScore);
        echo("2. Aくんの平均点は " . $AScoreAverage . " 点です");
    ?></p>
    <p><?php                                        //課題3-2
        $difference = differenceScore($AScore, $averageScore);
        foreach($difference as $subject => $differencePoint) {
            if($differencePoint == 0) {
                $differencePoint = "と同じ";
            }
            elseif($differencePoint < 0) {
                $differencePoint = "より" . abs($differencePoint) . "点低い";
            }
            else {
                $differencePoint = "より" . $differencePoint . "点高い";
            }
            echo($subjectTitle[$subject] . "は、平均点" . $differencePoint . "です。<br>");
        };
    ?></p>
</body>
</html>