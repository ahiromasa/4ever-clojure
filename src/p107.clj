(ns p107)

(= 256 (((fn [exp] (fn [n] (apply * (repeat exp n)))) 2) 16) (((fn [exp] (fn [n] (apply * (repeat exp n)))) 8) 2))

(= [1 8 27 64] (map ((fn [exp] (fn [n] (apply * (repeat exp n)))) 3) [1 2 3 4]))

(= [1 2 4 8 16] (map #(((fn [exp] (fn [n] (apply * (repeat exp n)))) %) 2) [0 1 2 3 4]))
