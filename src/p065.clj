(ns p065)

(= :map (#(let [coll (empty %)] (cond (= coll {}) :map (= coll #{}) :set (first (conj coll true false)) :vector :else :list)) {:a 1, :b 2}))

(= :list (#(let [coll (empty %)] (cond (= coll {}) :map (= coll #{}) :set (first (conj coll true false)) :vector :else :list)) (range (rand-int 20))))

(= :vector (#(let [coll (empty %)] (cond (= coll {}) :map (= coll #{}) :set (first (conj coll true false)) :vector :else :list)) [1 2 3 4 5 6]))

(= :set (#(let [coll (empty %)] (cond (= coll {}) :map (= coll #{}) :set (first (conj coll true false)) :vector :else :list)) #{10 (rand-int 5)}))

(= [:map :set :vector :list] (map #(let [coll (empty %)] (cond (= coll {}) :map (= coll #{}) :set (first (conj coll true false)) :vector :else :list)) [{} #{} [] ()]))
