(ns p020)

(= (#(-> % reverse second) (list 1 2 3 4 5)) 4)

(= (#(-> % reverse second) ["a" "b" "c"]) "b")

(= (#(-> % reverse second) [[1 2] [3 4]]) [1 2])
