(ns p023)

(= ((fn [coll] (reduce #(cons %2 %1) nil coll)) [1 2 3 4 5]) [5 4 3 2 1])

(= ((fn [coll] (reduce #(cons %2 %1) nil coll)) (sorted-set 5 7 2 7)) '(7 5 2))

(= ((fn [coll] (reduce #(cons %2 %1) nil coll)) [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]])
