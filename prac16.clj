
; 参照

; 作成(ref)
(def a (ref '(10 50)))

; 参照(deref)
(deref a) ; -> (10 50)

; 書き換え(ref-set)
; (ref-set a '(0 10)) ; err
(dosync (ref-set a '(0 10))) ; -> 0 10
(deref a) ; -> (0 10)
