
; partial
; (partial f arg1 arg2 ...)


; * を行う関数
(def times (partial *))

(times 1) ; -> 1

(times 1 2 3) ; -> 6

(* 1 2 3) ; -> 6


; * 100 を行う関数
(def hundred-times (partial * 100))

(hundred-times 1) ; -> 100

(hundred-times 1 2 3) ; -> 600

(* 100 1 2 3) ; -> 600


; + 100 を行う関数
(def add-hundred (partial + 100))

(add-hundred 1) ; -> 101

(add-hundred 1 2 3) ; -> 106

(+ 100 1 2 3) ; -> 106
