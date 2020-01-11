<?php
    function display(string $value)                                        //課題1
    {
        echo($value) . "<br>";
    }
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskFunc</title>
</head>
<body>
    <p><?php                                        //課題1
        $value1 = "関数で文字列を表示!";
        $value2 = "254 × 322 = 81788";
        display($value1);
        display($value2);
    ?></p>
    <p><?php                                        //課題2
        function createRandomNumberArray() {
            $params = [];
            for($i = 0; $i <= 9; $i++) {
                $params[$i] = rand(1, 100);
            }
            var_dump($params);
        }
        echo("<pre>");
        createRandomNumberArray();
        echo("</pre>");
    ?></p>
    <p><?php                                        //課題3
        function createRandomNumberArrayAndDisplay(array $array) {
            for($i = 0; $i <= 9; $i++) {
                $returnArray[$i] = rand(1, 100);
            }
                return $returnArray;
        }
        $array = [];
        $returnArray = createRandomNumberArrayAndDisplay($array);
        $cnt = 1;
        foreach($returnArray as $value) {
            $displayString = $cnt . "番目" . "の数値: " . $value;
            display($displayString);
            $cnt++;
        };
    ?></p>
    <p><?php                                        //課題4
        function numberAverageCalc(array $array, int $num = 0) {
            $total = 0;
            $cnt = 0;
            foreach($array as $value) {
                $total += $value;
                $num++;
            }
            $average1 = round($total / $num, 0);
            $average2 = round($total / $num, 1);
            echo("平均(小数点1位は四捨五入)は" . $average1 . "です！<br>");
            echo("平均(小数点2位は四捨五入)は" . $average2 . "です！<br>");
            foreach($array as $value) {
                if($value >= $average1) {
                    $cnt++;
                }
            }
            echo("平均以上は" . $cnt . "個です！");
        }
        numberAverageCalc($returnArray);
    ?></p>
</body>
<body>
</body>
</html>