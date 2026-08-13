(ns p063)

(= ((fn [f coll] (reduce #(update %1 (f %2) (fnil conj []) %2) {} coll)) #(> % 5) #{1 3 6 8}) {false [1 3] true [6 8]})

(= ((fn [f coll] (reduce #(update %1 (f %2) (fnil conj []) %2) {} coll)) #(apply / %) [[1 2] [2 4] [4 6] [3 6]]) {1/2 [[1 2] [2 4] [3 6]] 2/3 [[4 6]]})

(= ((fn [f coll] (reduce #(update %1 (f %2) (fnil conj []) %2) {} coll)) count [[1] [1 2] [3] [1 2 3] [2 3]]) {1 [[1] [3]] 2 [[1 2] [2 3]] 3 [[1 2 3]]})
