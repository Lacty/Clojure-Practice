
; key-param
(defn kok [{pos :pos size :size}]
  (str pos " " size))

(kok {:pos [1 1] :size 0})
;-> "[1 1] 0"
