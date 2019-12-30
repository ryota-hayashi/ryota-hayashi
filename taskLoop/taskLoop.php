<?php
    $fruits =  [                                        //課題1の配列定義
        'apple' => [
            'japanese' => 'りんご',
            'price' => 80,
        ],
        'orange' => [
            'japanese' => 'オレンジ',
            'price' => 120,
        ],
        'grape' => [
            'japanese' => 'ぶどう',
            'price' => 220,
        ]
        ];
    $tableHeader =[                                     //課題2のテーブルヘッダ用配列定義
        '国語',
        '数学',
        '社会',
        '理科',
        '英語'
    ];
    $scoreTable = [                                     //課題2の表データ配列定義
        'A' => [
            'japanese' => 34,
            'math' => 67,
            'society' => 45,
            'science' => 34,
            'english' => 89,
        ],
        'B' => [
            'japanese' => 76,
            'math' => 72,
            'society' => 65,
            'science' => 77,
            'english' => 80,
        ],
        'C' => [
            'japanese' => 98,
            'math' => 87,
            'society' => 88,
            'science' => 92,
            'english' => 96,
        ],
        'D' => [
            'japanese' => 65,
            'math' => 34,
            'society' => 71,
            'science' => 56,
            'english' => 76,
        ],
        'E' => [
            'japanese' => 67,
            'math' => 55,
            'society' => 87,
            'science' => 56,
            'english' => 69,
        ],
        'F' => [
            'japanese' => 81,
            'math' => 79,
            'society' => 74,
            'science' => 82,
            'english' => 85,
        ]
    ];
?>
<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>taskLoop</title>
</head>
<body>
    <p><?php                                        //課題1
            foreach($fruits as $key => $value){
                echo('英語では' . $key . 'と表示され、日本語では' . $value['japanese'] . '、価格は' . $value['price'] . '円です。');
            }
    ?></p>

    <table border=1>                                        <!--課題2-->
    <tr>
        <th>名前</th>
        <?php foreach($tableHeader as $subjects){ ?>
            <th><?= $subjects?></th>
        <?php } ?>
        <th>平均</th>
    </tr>
    <?php
        $nameCnt = 0;
        $japaneseTotal= 0;
        $mathTotal = 0;
        $societyTotal = 0;
        $scienceTotal = 0;
        $englishTotal = 0;
        $subjectAverageTotal = 0;
    ?>
    <?php foreach($scoreTable as $name => $scores){ ?>          <!--ループ１-->
        <?php
        $nameCnt ++;
        ?>
    <tr>
        <td><?= $name?></td>
        <?php
            $total = 0;
            $subjectCnt = 0;
        ?>
        <?php foreach($scores as $subjectScore){ ?>             <!--ループ2-->
            <td><?= $subjectScore?></td>
            <?php
                $total += $subjectScore;
                $subjectCnt ++;
                switch($subjectCnt) {
                    case 1:
                        $japaneseTotal += $subjectScore;
                        break;
                    case 2:
                        $mathTotal += $subjectScore;
                        break;
                    case 3:
                        $societyTotal += $subjectScore;
                        break;
                    case 4:
                        $scienceTotal += $subjectScore;
                        break;
                    case 5:
                        $englishTotal += $subjectScore;
                        break;
                }
            ?>
        <?php } ?>
        <?php
            $subjectAverage = $total / $subjectCnt;
            $subjectAverageTotal += $subjectAverage;
        ?>
        <td><?= $subjectAverage?></td>
    </tr>
    <?php } ?>
    <tr>
        <td>平均</td>
        <td><?= round($japaneseTotal /  $nameCnt, 1)?></td>
        <td><?= round($mathTotal / $nameCnt, 1)?></td>
        <td><?= round($societyTotal / $nameCnt, 1)?></td>
        <td><?= round($scienceTotal /  $nameCnt, 1)?></td>
        <td><?= round($englishTotal /  $nameCnt, 1)?></td>
        <td><?= round($subjectAverageTotal / $nameCnt, 1)?></td>
    </tr>
    </table>
</body>
<body>
</body>
</html>