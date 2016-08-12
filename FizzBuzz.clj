
; ClojureでFizzBuzzを実装してみる

; FizzBuzz
; 任意の数値に対して、3で割り切れる場合は"Fizz"を出力
; 5で割り切れる場合は"Buzz"を出力
; 15で割り切れる場合は"FizzBuzz"と出力
; 上に該当したい場合は数値を出力


(defn fizzbuzz [x] (cond (= (mod x 15) 0) (println "fizzbuzz")
                         (= (mod x 5) 0) (println "Buzz")
                         (= (mod x 3) 0) (println "Fizz")
                         :else (println x)))

; forを使用したFizzBuzz
(for [x (range 1 21)] (fizzbuzz x))


; 再帰を使用したFizzBuzz
(defn fb2 [end]
  (loop [i 0]
    (when (< i end) (do (fizzbuzz i) (recur (inc i))))))

(fb2 20)
