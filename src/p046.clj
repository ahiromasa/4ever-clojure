(ns p046)

(= 3 (((fn [f] (fn [& args] (->> args reverse (apply f)))) nth) 2 [1 2 3 4 5]))

(= true (((fn [f] (fn [& args] (->> args reverse (apply f)))) >) 7 8))

(= 4 (((fn [f] (fn [& args] (->> args reverse (apply f)))) quot) 2 8))

(= [1 2 3] (((fn [f] (fn [& args] (->> args reverse (apply f)))) take) [1 2 3 4 5] 3))
