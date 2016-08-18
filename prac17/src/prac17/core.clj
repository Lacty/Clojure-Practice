(ns prac17.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth)
  ;; set hash-map
  (set-state! :m-pos (atom [0 0])))

(defn draw []
  (background 255)
  (fill 192)
  (ellipse 100 100 30 30)
  (let [[x y] @(state :m-pos)]
    (ellipse x y 40 40)))

(defn mouse-moved []
  (let [x (mouse-x) y (mouse-y)]
    (reset! (state :m-pos) [x y])))

(defsketch example
  :title "mouse"
  :setup setup
  :draw draw
  :mouse-moved mouse-moved
  :size [200 200])

(defn -main [& args])
