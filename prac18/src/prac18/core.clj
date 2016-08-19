(ns prac18.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth)
  (no-stroke))

(defn draw []
  (background 255)
  (fill (if (mouse-pressed?) 0 100) 100 100)
  (ellipse 100 100 30 30))

(defsketch example
  :title "Example"
  :setup setup
  :draw draw
  :size [200 200])

(defn -main [& args])
