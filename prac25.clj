
; returning function
(defn hoo [x]
  "return multiplied value of itself"
  (* x x))

(def multiply hoo)

(multiply 6)
;-> 36


; let
(let [x 3] x)
;-> 3

; let make new scope
(def x 0)
(let [x 1] x)
;-> 1

(def arr ["ho" "hi" "hu"])
(let [[first & other] arr] [first other])
;-> ["ho" ("hi" "hu")]
