(ns p054)

(= (#(for [n (range (quot (count %2) %1))] (->> %2 (drop (* n %1)) (take %1))) 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))

(= (#(for [n (range (quot (count %2) %1))] (->> %2 (drop (* n %1)) (take %1))) 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))

(= (#(for [n (range (quot (count %2) %1))] (->> %2 (drop (* n %1)) (take %1))) 3 (range 8)) '((0 1 2) (3 4 5)))
