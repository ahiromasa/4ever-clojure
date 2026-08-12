(ns p059)

(= [21 6 1] (((fn [& fns] (fn [& args] (reduce #(conj %1 (apply %2 args)) [] fns))) + max min) 2 3 5 1 6 4))

(= ["HELLO" 5] (((fn [& fns] (fn [& args] (reduce #(conj %1 (apply %2 args)) [] fns))) #(.toUpperCase %) count) "hello"))

(= [2 6 4] (((fn [& fns] (fn [& args] (reduce #(conj %1 (apply %2 args)) [] fns))) :a :c :b) {:a 2, :b 4, :c 6, :d 8 :e 10}))
