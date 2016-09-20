(ns prac21.core
  (:require [quil.core :refer :all]))

(defstruct Ball :pos :size)

(defn setup []
  (smooth)
  (no-stroke)
  (frame-rate 10)
  (set-state! :balls (atom [])))

(defn create-ball [pos size]
  (struct Ball pos size))

(defn increase-ball [state]
  (swap! (state :balls) conj
    (create-ball [50 50] 20)))

(defn draw-ball [ball]
  (let [[x y] (:pos ball)
        size (:size ball)]
    (do (fill 0) ; color
        (ellipse x y size size)
        (println "x = " size))))

(defn draw-balls [[ball & balls]]
  (when ball
    (do (draw-ball ball)
        (draw-balls balls))))

(defn draw []
  (background 255)
  
  (when (mouse-pressed?)
    (increase-ball state))
  
  (draw-balls @(state :balls)))

(defsketch example
  :title "Example"
  :setup setup
  :draw draw
  :size [200 200])

(defn -main [& args])
