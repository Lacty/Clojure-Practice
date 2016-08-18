
(def fifi (atom [0 0]))
(deref fifi); -> [0 0]
            ; @fifi -> [0 0]

(reset! fifi [2 1])
(deref fifi) ; - > [2 1]

(swap! fifi conj 5)
(deref fifi) ; -> [2 1 5]


; Quil
; mouse-x mouse-y .etc, these param must be used in let

(defn fun [x] (zero? (mod x 5)))
(def arr (take 30 (range)))
(filter fun arr) ;-> (0 5 10 15 20 25)
