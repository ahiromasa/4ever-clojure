(ns p062)

(= (take 5 ((fn i [f init] (cons init (lazy-seq (i f (f init))))) #(* 2 %) 1)) [1 2 4 8 16])

(= (take 100 ((fn i [f init] (cons init (lazy-seq (i f (f init))))) inc 0)) (take 100 (range)))

(= (take 9 ((fn i [f init] (cons init (lazy-seq (i f (f init))))) #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))
