
; 再起関数
; loop と recurを使用する

; loop
(loop [x 10] (println x)) ; -> 10

; when
; ifとは違ってfalseの場合何もしない
(when (= 1 1) true) ; -> true
(when (= 1 2) true) ; -> nil


(loop [i 0]
  (when (< i 5)
    (println i)
    (recur (inc i)) ; loop i will take this value
)) ; -> 0 1 2 3 4


(loop [x 10]
  (when (> x 1)
    (println x)
    (recur (- x 2))
  )
) ; -> 10 8 6 4 2


(loop [x 0]
  (when (< x 10)
    (println x)
    (recur (+ x 2))
  )
) ; -> 0 2 4 6 8


; ifを使った再起関数
(defn hh [start end]
  (loop [i start]
    (if (< i end)
      (do (println i) (recur (inc i)))
      nil)))
(hh 0 10)
; -> 0 1 2 3 4 5 6 7 8 9
