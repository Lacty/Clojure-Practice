
; QuickSortを実装してみる

; 全要素がランダムな配列を作成
(def arr (take 10 (repeatedly #(rand-int 100))))
(println arr)

; 配列の中央の要素を求める
(defn pivot [x] (if (= (count x) 1)
                  nil
                  (nth x (/ (count x) 2))))
(pivot arr)

; quick sort 本体
; filterを使ってpivotより大きい要素をもつ配列と
; 小さい要素をもつ配列に分離させる
(defn qsort [x] (filter #(< % (pivot x)) x))
(qsort arr)
