<?php
    $intNum = 5;
    $str1 = "string型を使用するときに、ダブルクオート(\")を表示する場合は、バックスラッシュ(\)が必要です。";
    $str2 = 'I\'m Security Engineer';
    const greeting = "こんばんは";
    $name = "太郎くん";
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskDataType</title>
</head>
<body>
    <p><?php echo("りんごが" . "$intNum" . "個あります。"); ?></p>
    <p><?php echo($str1); ?></p>
    <p><?php echo($str2); ?></p>
    <p><?php echo(greeting . "、" . $name); ?></p>
</body>
</html>