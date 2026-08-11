(ns p053)

(= (#(->> (partition 2 1 %) (partition-by (fn [[x y]] (= (inc x) y))) (keep (fn [[[x y] :as coll]] (when (= (inc x) y) (conj (mapv first coll) (second (last coll)))))) (reduce (partial max-key count) [])) [1 0 1 2 3 0 4 5]) [0 1 2 3])

(= (#(->> (partition 2 1 %) (partition-by (fn [[x y]] (= (inc x) y))) (keep (fn [[[x y] :as coll]] (when (= (inc x) y) (conj (mapv first coll) (second (last coll)))))) (reduce (partial max-key count) [])) [5 6 1 3 2 7]) [5 6])

(= (#(->> (partition 2 1 %) (partition-by (fn [[x y]] (= (inc x) y))) (keep (fn [[[x y] :as coll]] (when (= (inc x) y) (conj (mapv first coll) (second (last coll)))))) (reduce (partial max-key count) [])) [2 3 3 4 5]) [3 4 5])

(= (#(->> (partition 2 1 %) (partition-by (fn [[x y]] (= (inc x) y))) (keep (fn [[[x y] :as coll]] (when (= (inc x) y) (conj (mapv first coll) (second (last coll)))))) (reduce (partial max-key count) [])) [7 6 5 4]) [])
