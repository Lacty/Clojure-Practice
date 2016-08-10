
; FILTER
; 全要素を関数でフィルタリングして
; 残ったものでリストを作る


(filter (fn [x] (= x "a")) '("a" "b" "c")) ; -> ("a")


; even? 偶数であればtrue
(filter even? '(1 2 3 4)) ; -> (2 4)

; odd? 奇数であればtrue
(filter odd? '(1 2 3 4)) ; -> (1 3)

; range 0 ~ 与えた数
(filter (fn [x] (< x 50)) (range 100)) ; -> (0 1 2 3... 49)


(filter (fn [x] (= (count x) 1)) '("a" "aa" "b" "hoge")) ; -> ("a" "b")

; fn [x]の部分を# 引数の部分を%に置き換えることができる
(filter #(= (count %) 1) '("a" "aa" "b" "hoge")) ; -> ("a" "b")
