(ns prac20.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth)
  (no-stroke)
  (frame-rate 30))

(def pos (atom [0 0]))
(def vel (atom [1 1]))

(defn update-state []
  (reset! pos (map + @pos @vel))
  (println "pos"))

(defn draw []
  (background 255)
  (fill 192)
  (reset! pos (map + @pos @vel))
  (let [[x y] @pos]
    (ellipse x y 30 30)))

(defsketch example
  :title "Example"
  :setup setup
  :update update-state
  :draw draw
  :size [200 200])

(defn -main [& args])
