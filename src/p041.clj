(ns p041)

(= ((fn [coll n] (keep-indexed #(when (not (zero? (mod (inc %1) n))) %2) coll)) [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= ((fn [coll n] (keep-indexed #(when (not (zero? (mod (inc %1) n))) %2) coll)) [:a :b :c :d :e :f] 2) [:a :c :e])

(= ((fn [coll n] (keep-indexed #(when (not (zero? (mod (inc %1) n))) %2) coll)) [1 2 3 4 5 6] 4) [1 2 3 5 6])
