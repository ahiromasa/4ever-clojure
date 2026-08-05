(ns p026)

(= (#(->> (iterate (fn [[a b]] [b (+ a b)]) [0 1]) (map second) (take %)) 3) '(1 1 2))

(= (#(->> (iterate (fn [[a b]] [b (+ a b)]) [0 1]) (map second) (take %)) 6) '(1 1 2 3 5 8))

(= (#(->> (iterate (fn [[a b]] [b (+ a b)]) [0 1]) (map second) (take %)) 8) '(1 1 2 3 5 8 13 21))
