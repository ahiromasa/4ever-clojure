(ns p044)

(= (#(let [n (mod %1 (count %2))] (concat (drop n %2) (take n %2))) 2 [1 2 3 4 5]) '(3 4 5 1 2))

(= (#(let [n (mod %1 (count %2))] (concat (drop n %2) (take n %2))) -2 [1 2 3 4 5]) '(4 5 1 2 3))

(= (#(let [n (mod %1 (count %2))] (concat (drop n %2) (take n %2))) 6 [1 2 3 4 5]) '(2 3 4 5 1))

(= (#(let [n (mod %1 (count %2))] (concat (drop n %2) (take n %2))) 1 '(:a :b :c)) '(:b :c :a))

(= (#(let [n (mod %1 (count %2))] (concat (drop n %2) (take n %2))) -4 '(:a :b :c)) '(:c :a :b))
