(ns p060)

(= (take 5 ((fn r ([f [x & xs]] (r f x xs)) ([f init [x & xs]] (cons init (lazy-seq (when x (r f (f init x) xs)))))) + (range))) [0 1 3 6 10])

(= ((fn r ([f [x & xs]] (r f x xs)) ([f init [x & xs]] (cons init (lazy-seq (when x (r f (f init x) xs)))))) conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]])

(= (last ((fn r ([f [x & xs]] (r f x xs)) ([f init [x & xs]] (cons init (lazy-seq (when x (r f (f init x) xs)))))) * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)
