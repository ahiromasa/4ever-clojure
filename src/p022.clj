(ns p022)

(= (#(->> % (map (constantly 1)) (reduce +)) '(1 2 3 3 1)) 5)

(= (#(->> % (map (constantly 1)) (reduce +)) "Hello World") 11)

(= (#(->> % (map (constantly 1)) (reduce +)) [[1 2] [3 4] [5 6]]) 3)

(= (#(->> % (map (constantly 1)) (reduce +)) '(13)) 1)

(= (#(->> % (map (constantly 1)) (reduce +)) '(:a :b :c)) 3)
