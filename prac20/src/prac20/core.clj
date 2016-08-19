(ns prac20.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth)
  (no-stroke))

(def pos (atom [0 0]))
(def vel (atom [(rand -1.0 1.0)
                (rand -1.0 1.0)]))

(defn update []
  (swap! pos (map + vel)))

(defn draw []
  (background 255)
  (fill 192)
  (let [[x y] @pos]
    (ellipse x y 30 30)))

(defsketch example
  :title "Example"
  :setup setup
  :draw draw
  :size [200 200])

(defn -main [& args])
