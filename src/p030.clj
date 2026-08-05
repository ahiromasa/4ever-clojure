(ns p030)

(= (apply str (sequence (dedupe) "Leeeeeerrroyyy")) "Leroy")

(= (sequence (dedupe) [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= (sequence (dedupe) [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
