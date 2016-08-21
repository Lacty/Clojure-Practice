
(def pos (atom [0 0]))
(def vel (atom [1 1]))

(reset! pos (map + @pos vel))
