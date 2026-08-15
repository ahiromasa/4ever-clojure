(ns p134)

(true? ((fn [k m] (and (contains? m k) (nil? (k m)))) :a {:a nil :b 2}))

(false? ((fn [k m] (and (contains? m k) (nil? (k m)))) :b {:a nil :b 2}))

(false? ((fn [k m] (and (contains? m k) (nil? (k m)))) :c {:a nil :b 2}))
