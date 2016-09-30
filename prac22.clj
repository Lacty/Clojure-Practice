
; function overload
(defn huga
  ([]  "no param"  ())
  ([x] "one param" (inc x)))

(huga) ;->()
(huga 10) ;->11


; rest parameters
(defn hage
  [& arr]
  (map #(str "my name is " %) arr))

(hage "hoho" "haha")
;-> ("my name is hoho"
;    "my name is haha")


; first is within a vector
(defn piyo
  [[first]]
  (str first))

(piyo ["aa" "bb"]) ;-> "aa"


(defn hoo
  [[first second & other]]
  (str "i'm choice first-" first
       " second-" second
       " other-" (clojure.string/join ", " other)))

(hoo ["ore" "kimi" "orera" "a"])
;-> "i'm choice first-ore second-kimi other-orera, a"
