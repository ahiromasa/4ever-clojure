(ns p088)

(= (#(set (concat (remove %1 %2) (remove %2 %1))) #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})

(= (#(set (concat (remove %1 %2) (remove %2 %1))) #{:a :b :c} #{}) #{:a :b :c})

(= (#(set (concat (remove %1 %2) (remove %2 %1))) #{} #{4 5 6}) #{4 5 6})

(= (#(set (concat (remove %1 %2) (remove %2 %1))) #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})
