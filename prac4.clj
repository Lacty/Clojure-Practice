
; リスト


; (1 2 3 4)
; 上だと1という関数に2 3 4を引数として渡すと解釈される

; '(1 2 3 4) 'をつけることで評価を抑制することができる


; first リストの一番目を取得できる
(first '(1 2 3 4)) ; -> 1

; last リストの末尾を取得できる
(last '(1 2 3 4)) ; -> 4

; cons(construct) 1つの要素とリストを連結させる
(cons 1 '(2 3 4)) ; -> (1 2 3 4)


; リストの正体
; (1 2 3) は
(cons 1 (cons 2 (cons 3 '()))) ; -> (1 2 3)

; cons 3 と '()    を連結させて (3)     を作成
; cons 2 と '(3)   を連結させて (2 3)   を作成
; cons 1 と '(2 3) を連結させて (1 2 3) を作成
