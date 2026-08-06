(ns p033)

(= ((fn [coll n] (->> coll (map #(repeat n %)) (apply concat))) [1 2 3] 2) '(1 1 2 2 3 3))

(= ((fn [coll n] (->> coll (map #(repeat n %)) (apply concat))) [:a :b] 4) '(:a :a :a :a :b :b :b :b))

(= ((fn [coll n] (->> coll (map #(repeat n %)) (apply concat))) [4 5 6] 1) '(4 5 6))

(= ((fn [coll n] (->> coll (map #(repeat n %)) (apply concat))) [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))

(= ((fn [coll n] (->> coll (map #(repeat n %)) (apply concat))) [44 33] 2) [44 44 33 33])
