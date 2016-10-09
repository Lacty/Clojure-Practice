
; function body

(defn hoo []
  (- 8 3)
  (+ 1 2)
  "this is hoo")

(hoo)
;-> "this is hoo"


((fn [x] (* x x)) 8)
;-> 64

((fn [] "aa"))
;-> "aa"

; more conpact function
(#(* % %) 8)
;-> 64
