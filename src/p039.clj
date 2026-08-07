(ns p039)

(= (#(->> (map list %1 %2) flatten) [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(= (#(->> (map list %1 %2) flatten) [1 2] [3 4 5 6]) '(1 3 2 4))

(= (#(->> (map list %1 %2) flatten) [1 2 3 4] [5]) [1 5])

(= (#(->> (map list %1 %2) flatten) [30 20] [25 15]) [30 25 20 15])
