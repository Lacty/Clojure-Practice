
; 条件分岐


; (if [条件式] true false)

(if true 1 2) ; -> 1

(if false 1 2) ; -> 2

(if (= 10 11) 1 2) ; -> 2


(if (Boolean. false) "yes" "no") ; -> "yes"


(defn is-under100? [num]
  (if (< num 100) "yes" "no"))
(is-under100? 50) ; -> "yes"


(if 0 true false) ; -> true

(if nil true false) ; -> false

; vectorのnilはnilと同値ではない
(if [nil] true false) ; -> true

(if (first [nil]) true false) ; -> false
