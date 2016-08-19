(ns prac19.core
  (:require [quil.core :refer :all]))

(defn setup []
  (smooth)
  (no-stroke)
  (set-state! :p-key (atom false)))

(defn draw []
  (background 255)
  (fill 192)
  (ellipse (if @(state :p-key) 0 100) 100 30 30))

(defn key-press []
  (reset! (state :p-key) (if (= (key-code) (int \A)) true false))
  
  ; outputs
  (println (if (= (key-code) (int \a)) true false) (raw-key) (key-code) (int \a)))

(defsketch example
  :title "Example"
  :setup setup
  :draw draw
  :key-pressed key-press
  :size [200 200])

(defn -main [& args])
