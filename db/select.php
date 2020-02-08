<?php

?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskCalc</title>
</head>
<body>
<!-- 課題1-1 -->
    <p><?php echo(
        "select name, area from country where area = 'ヨーロッパ';"
    ); ?></p>
<!-- 課題1-2 -->
<p><?php echo(
        "select name, area from country where area != 'ヨーロッパ';"
    ); ?></p>
<!-- 課題1-3 -->
<p><?php echo(
        "select name, lang from country where lang = '英語';"
    ); ?></p>
<!-- 課題1-4 -->
<p><?php echo(
        "select name, area, lang from country where area = 'ヨーロッパ' and lang = '英語';"
    ); ?></p>
<!-- 課題1-5 -->
<p><?php echo(
        "select * from country where area = 'ヨーロッパ' or number < 40;"
    ); ?></p>

<!-- 課題2-1 -->
<p><?php echo(
        "select name from country where name like 'イ%';"
    ); ?></p>
<!-- 課題2-2 -->
<p><?php echo(
        "select name from country where name like '%ス';"
    ); ?></p>
<!-- 課題2-3 -->
<p><?php echo(
        "select * from heritage where country_id in (1, 3);"
    ); ?></p>
<!-- 課題2-4 -->
<p><?php echo(
        "select * from heritage where not country_id in (1, 3);"
    ); ?></p>
<!-- 課題2-5 -->
<p><?php echo(
        "select * from heritage where type = '文化' order by country_id asc;"
    ); ?></p>
<!-- 課題2-6 -->
<p><?php echo(
        "select * from heritage order by country_id asc, id desc;"
    ); ?></p>
</body>
<body>
</body>
</html>