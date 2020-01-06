<?php
    function calculation(string $num1, string $num2): string                                        //課題1
    {
        return $num1 . " × " . $num2 ." = " . $num1 * $num2;
    };

    function display(array $num, callable $function)                                        //課題1
    {
        $calNum = $function(...$num);
        echo("関数で文字列を表示!<br>" . $calNum);
    };
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
        $numParam = [254, 322];
        display($numParam, "calculation");
    ?></p>
    <p><?php                                        //課題2
        function createRandomNumbberArray() {
            $params = [];
            for($i = 0; $i <= 9; $i++) {
                $params[$i] = rand(1, 100);
            }
            var_dump($params);
        }
        echo("<pre>");
        createRandomNumbberArray();
        echo("</pre>");
    ?></p>
    <p><?php                                        //課題3
        function createRandomNumberArrayAndDisplay() {
            $returnBox = "";
            for($i = 0; $i <= 9; $i++) {
                $array[$i] = rand(1, 100);
                $returnBox .= $i + 1 . "番目の数値: " . $array[$i] . "<br>";
            }
                return $returnBox;
        }
        $array = [];
        display($array, "createRandomNumberArrayAndDisplay");
    ?></p>
</body>
<body>
</body>
</html>