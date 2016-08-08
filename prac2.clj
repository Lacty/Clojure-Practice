
; 関数


; 無名関数
; T func(T x, T y) { return x + y; }
(fn [x y] (+ x y))

; 無名関数の使用
((fn [x y] (+ x y)) 3 5) ; -> 8


; 関数定義
(def add (fn [x y] (+ x y)))

; add関数の使用
(add 3 5) ; -> 8


; 関数部分と定義部分を同時に行う
(defn minus [x y] (- x y))
(minus 6 1) ; -> 5