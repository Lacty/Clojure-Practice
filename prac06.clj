
; MAP
; リストに特定の関数を適用した結果を得る


; inc(インクリメント)要素に1足す
(map inc '(1 2 3 4)) ; -> (2 3 4 5)

; 自作関数を適用
(map (fn [x] (* x 3)) '(1 2 3)) ; -> (3 6 9)


(map + '(1 2 3) '(1 2 3)) ; -> (2 4 6)

; iterateについては後程
(map + '(1 2 3) (iterate inc 1)) ; -> (2 4 6)


(map {2 "two" 3 "three"} '(1 2 3 4 5))
  ; -> (nil "two" "three" nil nil)
