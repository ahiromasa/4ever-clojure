(ns p067)

(= ((fn [n] (->> (iterate inc 2) ((fn f [[x & xs]] (cons x (lazy-seq (f (remove #(zero? (mod % x)) xs)))))) (take n))) 2) [2 3])

(= ((fn [n] (->> (iterate inc 2) ((fn f [[x & xs]] (cons x (lazy-seq (f (remove #(zero? (mod % x)) xs)))))) (take n))) 5) [2 3 5 7 11])

(= (last ((fn [n] (->> (iterate inc 2) ((fn f [[x & xs]] (cons x (lazy-seq (f (remove #(zero? (mod % x)) xs)))))) (take n))) 100)) 541)
