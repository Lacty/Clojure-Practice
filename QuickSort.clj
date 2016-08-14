
; QuickSortを実装してみる

; 全要素がランダムな配列を作成
(def arr (take 10 (repeatedly #(rand-int 100))))
(println arr)


(defn qsort [[pivot & coll]]
  (when pivot
    (concat (qsort (filter #(< % pivot) coll))
            [pivot]
            (qsort (filter #(>= % pivot) coll)))))

(qsort arr)


; qsort関数はここから
; http://eddmann.com/posts/quicksort-in-clojure/

; 関数の仮引数である [[pivot & coll]]
; pivotには配列の頭の要素が入る
; collには頭の要素を除いた配列が入る

; (when pivot この部分で
; pivotに要素がなければ再帰を停止する

; concatは与えられた可変長引数を配列にまとめる
; qsortに入ってきたpivotを一つずつ配列に加える

; 結果以下の形になる
; (concat (< の要素) [pivot] (>= の要素))
