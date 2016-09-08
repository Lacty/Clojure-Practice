(ns prac21.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth)
  (no-stroke)
  (frame-rate 30)
  (set-state! :balls (atom [])))

(defn draw []
  (background 255)
  (fill 192)
  (ellipse 100 100 30 30))

(defsketch example
  :title "Example"
  :setup setup
  :draw draw
  :size [200 200])

(defn -main [& args])
