(ns p019)

(= (#(-> % reverse first) [1 2 3 4 5]) 5)

(= (#(-> % reverse first) '(5 4 3)) 3)

(= (#(-> % reverse first) ["b" "c" "d"]) "d")
