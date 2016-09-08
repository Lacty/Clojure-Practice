
; create struct
(defstruct foo :speed :size)
(defstruct hoo :vvv :aaa)
(def ball (struct foo 2 5))
(def vall (struct foo 1 4))
(def hall (struct hoo 1 2))

; create an array to store the structure
(def arr [])

; add struct to array
(conj arr ball)
(conj arr vall)
(conj arr hall)
