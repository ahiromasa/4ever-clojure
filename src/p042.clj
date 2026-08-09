(ns p042)

(= (#(->> (range 1 (inc %)) (reduce *)) 1) 1)

(= (#(->> (range 1 (inc %)) (reduce *)) 3) 6)

(= (#(->> (range 1 (inc %)) (reduce *)) 5) 120)

(= (#(->> (range 1 (inc %)) (reduce *)) 8) 40320)
