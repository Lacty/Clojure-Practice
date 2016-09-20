(ns prac20.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth)
  (no-stroke)
  (frame-rate 60))

(def pos (atom [100 100]))
(def vel (atom [(rand 6.0) (rand 6.0)]))

(defn draw []
  (background 255)
  
  ; update
  (reset! pos (map + @pos @vel))
  (let [[x y] @pos]
    (cond
      (or (>= x 200) (<= x 0)) (swap! vel (fn [[x y]] [(- x) y]))
      (or (>= y 200) (<= y 0)) (swap! vel (fn [[x y]] [x (- y)]))))

  
  ; draw
  (fill 192)
  (let [[x y] @pos]
    (ellipse x y 30 30)))

(defsketch example
  :title "Example"
  :setup setup
  :draw draw
  :size [200 200])

(defn -main [& args])
