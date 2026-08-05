(ns p028)

(= ((fn f [coll] (if (coll? coll) (mapcat f coll) (list coll))) '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= ((fn f [coll] (if (coll? coll) (mapcat f coll) (list coll))) ["a" ["b"] "c"]) '("a" "b" "c"))

(= ((fn f [coll] (if (coll? coll) (mapcat f coll) (list coll))) '((((:a))))) '(:a))
