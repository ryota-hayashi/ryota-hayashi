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
    <p><?php echo('(1 + 3) × 5 = '.(1 + 3) * 5 .' です。'); ?></p>
    <p><?php echo('22 ÷ 3 = '.round(22 / 3, 2) .' です。※小数点第3位を四捨五入'); ?></p>
    <p><?php echo('22 ÷ 3 = '.ceil(22 / 3) .' です。※小数点以下を切り上げ'); ?></p>
    <p><?php echo('22 ÷ 3 = '.floor(22 / 3) .' です。※小数点以下を切り下げ'); ?></p>
    <p><?php echo('サイコロを2つ振ったときに、総計が8となる確率は '.round(5 / (6 * 6), 2) .' です。'); ?></p>
</body>
<body>
</body>
</html>