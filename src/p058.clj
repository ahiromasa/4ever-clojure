(ns p058)

(= [3 2 1] (((fn [& fns] (fn [& args] (->> fns reverse (reduce #(vector (apply %2 %1)) args) first))) rest reverse) [1 2 3 4]))

(= 5 (((fn [& fns] (fn [& args] (->> fns reverse (reduce #(vector (apply %2 %1)) args) first))) (partial + 3) second) [1 2 3 4]))

(= true (((fn [& fns] (fn [& args] (->> fns reverse (reduce #(vector (apply %2 %1)) args) first))) zero? #(mod % 8) +) 3 5 7 9))

(= "HELLO" (((fn [& fns] (fn [& args] (->> fns reverse (reduce #(vector (apply %2 %1)) args) first))) #(.toUpperCase %) #(apply str %) take) 5 "hello world"))
