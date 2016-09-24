(ns test.core
  (:gen-class))

(defstruct Player :name)

(def arr (atom [(struct Player "hoge")]))

(swap! arr conj (struct Player "piyo"))

(when-not (empty? @arr)
  (println (map #(struct Player (str (:name %) "a")) @arr)))

(defn -main []
  (println "Hello, World!"))
