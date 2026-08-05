(ns p032)

(= (mapcat #(list % %) [1 2 3]) '(1 1 2 2 3 3))

(= (mapcat #(list % %) [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))

(= (mapcat #(list % %) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(= (mapcat #(list % %) [44 33]) [44 44 33 33])
