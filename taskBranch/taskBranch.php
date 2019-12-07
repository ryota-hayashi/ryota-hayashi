<?php
    $str1 = "100";
    $japanese = rand(1, 100);
    $math = rand(1, 100);
    $science = rand(1, 100);
    $society = rand(1, 100);
    $english = rand(1, 100);
    $average = ($japanese + $math + $science + $society + $english) / 5;
    $everyoneAverage = 67.3;
    $case = '0';
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskBranch</title>
</head>
<body> 
    <p><?php                                        //課題1-1
            if($str1 == 100) {
                echo('$str1は100です。');  
            }
            else {
                echo('$str1は100ではありません。');
            }
        ?></p>
    <p><?php                                        //課題1-2
            if($str1 === 100) {
                echo('$str1は数字の100です。');  
            }
            else {
                echo('$str1は数字の100ではありません。');
            }
        ?></p>
    <p><?php                                        //課題1-3
            if($str1 > 100) {
                echo('$str1は101以上です。');  
            }
            else {
                echo('$str1は101以上ではありません。');
            }
        ?></p>
    <p><?php                                        //課題1-4
            if($str1 >= 100) {
                echo('$str1は100以上です。');  
            }
            else {
                echo('$str1は100以上ではありません。');
            }
        ?></p>
    <p><?php                                        //課題2-1
            echo("Aくんの平均点は".$average."点です。");
        ?></p>
    <p><?php                                        //課題2-2
            if($average >= $everyoneAverage) {
                echo('Aくんの平均点は67.3以上です。');  
            }
            else {
                echo('Aくんの平均点は67.3未満です。');
            }
        ?></p>
    <p><?php                                        //課題3-1
            switch ($case) {
                case true:
                    echo 'bool';
                    break;
                
                case 1:
                    echo 'int';
                    break;
                
                case '1':
                    echo 'string';
                    break;

                default:
                    echo 'other';
            }
        ?></p>
    <p><?php                                        //課題3-2
            switch ($case) {            // ※2 「 ※1の結果と == による緩やかな比較」
                case $case===true:      // ※1「=== による厳密な比較」
                    echo 'bool';
                    break;
                
                case ($case === 1):
                    echo 'int';
                    break;
                    
                case $case === '1':
                    echo 'string';
                    break;

                default:
                    echo 'other';
            }
        ?></p>
<!--参照URL：https://www.php.net/manual/ja/types.comparisons.php
******************************************************************************************
課題3-2について
******************************************************************************************
$case = 0 ; で行う場合、

※1「0 === true ⇨ false」

※2 「0 == false(※1の結果)」 ⇨ 0はbooleanだとfalse のため合致する

結果 echo ‘bool’が実行される

******************************************************************************************
$case = ‘1’ ;で行う場合、

※1「’1’ === true ⇨ false(※1の結果)」

※2 「’1’ == false」 ⇨ ’1’はbooleanだとtrue のため合致しない

当てはまらず、以降の条件分岐の処理に入り、結果当てはまる’string’が表示される

******************************************************************************************
-->
</body>
</html>