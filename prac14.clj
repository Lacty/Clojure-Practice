
; apply
; リストの全要素に関数を実行した結果をもとめる

(apply + '(1 2 3)) ; -> 6

; reduceとにている・・？
(reduce + '(1 2 3)) ; -> 6


(def ss '("aa" "bb" "cc"))
(reduce str ss) ; -> "aabbcc"

(apply str ss) ; -> "aabbcc"
