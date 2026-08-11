(ns p050)

(= (set (#(->> % (group-by type) vals) [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})

(= (set (#(->> % (group-by type) vals) [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})

(= (set (#(->> % (group-by type) vals) [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]})
