(ns p156)

(= ((fn [x coll] (reduce #(assoc %1 %2 x) {} coll)) 0 [:a :b :c]) {:a 0 :b 0 :c 0})

(= ((fn [x coll] (reduce #(assoc %1 %2 x) {} coll)) "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})

(= ((fn [x coll] (reduce #(assoc %1 %2 x) {} coll)) [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})
