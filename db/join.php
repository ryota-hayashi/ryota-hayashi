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
        "select country.id, country.area, heritage.name from country inner join heritage on country.id = heritage.country_id;"
    ); ?></p>
<!-- 課題1-2 -->
<p><?php echo(
        "select heritage.name, country.name from country inner join heritage on country.id = heritage.country_id where area = 'ヨーロッパ';"
    ); ?></p>
<!-- 課題1-3 -->
<p><?php echo(
        "select heritage.name, country.name, country.number from country inner join heritage on country.id = heritage.country_id where number >= 40 and heritage.type = '文化';"
    ); ?></p>
<!-- 課題1-4 -->
<p><?php echo(
        "select country.name, heritage_shizen.name from country
        LEFT JOIN
        (select * from heritage where type = '自然') heritage_shizen
        on country.id = heritage_shizen.country_id;"
    ); ?></p>
</body>
<body>
</body>
</html>