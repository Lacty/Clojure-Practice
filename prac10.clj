
; iterate
; 与えられた関数を繰り返し適用し
; 得られる要素が並ぶリストを作成する

; (iterate f x)
; x, (f x), (f (f x)) .etc


(iterate inc 1) ; -> (1 2 3 4 5...)

; 上記は以下のような形になる
(list 1 (inc 1) (inc (inc 1))) ; -> (1 2 3)


(take 5 (iterate inc 0)) ; -> (0 1 2 3 4)


; 2乗していく
(take 5 (iterate (fn [x] (* x 2)) 1)) ; -> (1 2 4 8 16)
