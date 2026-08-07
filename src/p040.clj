(ns p040)

(= ((fn [x coll] (->> coll (map #(vector % x)) flatten butlast)) 0 [1 2 3]) [1 0 2 0 3])

(= (apply str ((fn [x coll] (->> coll (map #(vector % x)) flatten butlast)) ", " ["one" "two" "three"])) "one, two, three")

(= ((fn [x coll] (->> coll (map #(vector % x)) flatten butlast)) :z [:a :b :c :d]) [:a :z :b :z :c :z :d])
