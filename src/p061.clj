(ns p061)

(= (#(loop [[x & xs] %1 [y & ys] %2 result {}] (if (and x y) (recur xs ys (assoc result x y)) result)) [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})

(= (#(loop [[x & xs] %1 [y & ys] %2 result {}] (if (and x y) (recur xs ys (assoc result x y)) result)) [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})

(= (#(loop [[x & xs] %1 [y & ys] %2 result {}] (if (and x y) (recur xs ys (assoc result x y)) result)) [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})
