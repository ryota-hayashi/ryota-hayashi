<?php
    function divideQuarter(int $num) {
        return $num / 4;
    }
    function divideQuarterReference(int &$num) {
        $num /= 4;
    }
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskHandOver</title>
</head>
<body>
    <p><?php                                        //課題1
        $num1 = 2000;
        $result = divideQuarter($num1);
        echo($num1 . "を4で割った値は" . $result . "です。(値渡し)");
    ?></p>
    <p><?php                                        //課題2
        $num2 = 1000;
        divideQuarterReference($num2);
        echo("1000を4で割った値は" . $num2 . "です。(参照渡し)");
    ?></p>
</body>
<body>
</body>
</html>