(ns p056)

(= ((fn [coll] (reduce #(if (some #{%2} %1) %1 (conj %1 %2)) [] coll)) [1 2 1 3 1 2 4]) [1 2 3 4])

(= ((fn [coll] (reduce #(if (some #{%2} %1) %1 (conj %1 %2)) [] coll)) [:a :a :b :b :c :c]) [:a :b :c])

(= ((fn [coll] (reduce #(if (some #{%2} %1) %1 (conj %1 %2)) [] coll)) '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))

(= ((fn [coll] (reduce #(if (some #{%2} %1) %1 (conj %1 %2)) [] coll)) (range 50)) (range 50))
