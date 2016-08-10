
; SET
; 集合

(set '(1 2 3)) ; -> #{1 2 3}

; 集合なので同じものは無い
(conj #{1 2 3} 1) ; -> #{1 2 3}


; HASH-MAP
; key と value で作成される

{:a 1 :b 2}

(hash-map :a 1 :b 2) ; -> {:a 1 :b 2}


; keyを使用してvalueを取り出す
(def hm (hash-map :a 1 :b 2))
(:a hm) ; -> 1
(hm :b) ; -> 2
