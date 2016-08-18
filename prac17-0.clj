
(def fifi (atom [0 0]))
(deref fifi); -> [0 0]
            ; @fifi -> [0 0]

(reset! fifi [2 1])
(deref fifi) ; - > [2 1]

(swap! fifi conj 5)
(deref fifi) ; -> [2 1 5]
