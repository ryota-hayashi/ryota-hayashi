<?php
    function calcNumber(int $num1, int $num2, bool $bool)                               //課題1
        {
            if($bool == true) {
                return $num1 . " + " . $num2 . " = " . ($num1 + $num2);             //()で括らないと「$num1 + $num2」より先に「"=" . $num1」が優先されるため注意
            }
            else {
                return $num1 . " - " . $num2 . " = " . ($num1 - $num2);             //()で括らないと「$num1 - $num2」より先に「"=" . $num1」が優先されるため注意
            }
        }
    
    $exponentiation =  function(int $num, bool $bool) {                                 //課題2
        if($bool == true) {
            return $num . " の2乗は " . ($num ** 2);
        }
        else {
            return $num . " の3乗は " . ($num ** 3);
        } 
    };

    function calcAverage(array $array) {                                        //課題3-1
        $cnt = 0;
        $total = 0;
        foreach($array as $value) {
            $total += $value;
            $cnt++;
        }
        return(round($total / $cnt));
    }

    function differenceScore(array $array1, array $array2) {                                        //課題3-2
        $difference = [];
        foreach($array1 as $subject => $value1) {
            $difference[$subject] = $value1 - $array2[$subject];
        }
        return $difference;
    }
?>