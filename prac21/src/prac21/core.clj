(ns prac21.core
  (:require [quil.core :refer :all]))

(defstruct Ball :pos :size)

(defn setup []
  (smooth)
  (no-stroke)
  (frame-rate 30)
  (set-state! :balls (atom [])))

(defn create-ball [pos size]
  (struct Ball pos size))

(defn increase-ball [state]
  (swap! (state :balls) conj (create-ball [50 50] 5)))

(defn draw []
  (when (mouse-pressed?)
    (increase-ball state))
  
  (background 255)
  (fill 192)
  (ellipse 100 100 30 30))

(defsketch example
  :title "Example"
  :setup setup
  :draw draw
  :size [200 200])

(defn -main [& args])
