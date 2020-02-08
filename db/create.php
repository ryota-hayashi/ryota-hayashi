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
<!-- 課題1 -->
    <p><?php echo("create table country
        (id int auto_increment primary key not null comment '国名', 
        name varchar(20) not null comment '国名', 
        area varchar(10) comment 'エリア', 
        lang varchar(10) default '英語' comment '公用語', 
        number int default 0 comment '国番号')"); ?></p>
<!-- 課題2 -->
    <p><?php echo("create table heritage
        (id int auto_increment primary key not null comment '世界遺産ID', 
        name varchar(20) not null comment '世界遺産名', 
        country_id int not null comment '国ID', 
        type varchar(2) not null comment '種別')"); ?></p>
</body>
<body>
</body>
</html>