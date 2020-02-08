<?php

/**
 * 表示を行う
 *
 * @param  string $string
 * @return null
 */
function display(string $string)
{
    echo ('<p>' . $string . '</p>');
}

// ここに回答を追記
$text = '色を設定しました！';
if(!isset($_GET['color'])) {
    $color = 'black';
}else{
    $color = $_GET['color'];
}
setcookie('color', $color);

?>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>taskCookieSetColor</title>
    </head>
    <body>
        <?php display($text); ?>
        <button onclick="location.href='taskCookieImplement.php'">
            戻る
        </button>
    </body>
</html>
