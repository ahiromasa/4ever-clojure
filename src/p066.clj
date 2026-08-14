(ns p066)

(= (#(loop [x %1 y %2] (if (zero? y) x (recur y (mod x y)))) 2 4) 2)

(= (#(loop [x %1 y %2] (if (zero? y) x (recur y (mod x y)))) 10 5) 5)

(= (#(loop [x %1 y %2] (if (zero? y) x (recur y (mod x y)))) 5 7) 1)

(= (#(loop [x %1 y %2] (if (zero? y) x (recur y (mod x y)))) 1023 858) 33)
