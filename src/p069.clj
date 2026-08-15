(ns p069)

(= ((fn [f & coll] (reduce (fn [result x] (reduce-kv (fn [m k v] (if (contains? m k) (update m k f v) (assoc m k v))) result x)) coll)) * {:a 2, :b 3, :c 4} {:a 2} {:b 2} {:c 5}) {:a 4, :b 6, :c 20})

(= ((fn [f & coll] (reduce (fn [result x] (reduce-kv (fn [m k v] (if (contains? m k) (update m k f v) (assoc m k v))) result x)) coll)) - {1 10, 2 20} {1 3, 2 10, 3 15}) {1 7, 2 10, 3 15})

(= ((fn [f & coll] (reduce (fn [result x] (reduce-kv (fn [m k v] (if (contains? m k) (update m k f v) (assoc m k v))) result x)) coll)) concat {:a [3], :b [6]} {:a [4 5], :c [8 9]} {:b [7]}) {:a [3 4 5], :b [6 7], :c [8 9]})
