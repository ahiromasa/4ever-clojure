(ns p055)

(= ((fn [coll] (reduce (fn [result k] (update result k #(if % (inc %) 1))) {} coll)) [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})

(= ((fn [coll] (reduce (fn [result k] (update result k #(if % (inc %) 1))) {} coll)) [:b :a :b :a :b]) {:a 2, :b 3})

(= ((fn [coll] (reduce (fn [result k] (update result k #(if % (inc %) 1))) {} coll)) '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})
