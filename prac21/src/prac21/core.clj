(ns prac21.core
  (:require [quil.core :refer :all]))

(defstruct Ball :pos :size :color)

(defn setup []
  (smooth)
  (no-stroke)
  (frame-rate 30)
  (set-state! :balls (atom [])))

(defn create-ball [pos size color]
  (struct Ball pos size color))

(def low-color-val 50)
(defn increase-ball [state]
  (swap! (state :balls) conj
    (create-ball [(rand 200.0) (rand 200.0)] ; pos
                 (rand 40.0) ; size
                 [(+ low-color-val (rand (- 256 low-color-val)))
                  (+ low-color-val (rand (- 256 low-color-val)))
                  (+ low-color-val (rand (- 256 low-color-val)))]))) ; color
aaaaa
(defn draw-ball [ball]
  (let [[x y] (:pos ball)
        size (:size ball)
        [r g b] (:color ball)]
    (do (fill r g b)
        (ellipse x y size size))))

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
