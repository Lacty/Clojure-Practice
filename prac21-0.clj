
; create struct
(defstruct foo :speed :size)
(def ball (struct foo 2 5))

; create an array to store the structure
(def arr [])

; add struct to array
(def arr (conj arr ball))
(do arr)
(def arr (conj arr ball))
(do arr)
