(ns p070)

(= (#(->> % (re-seq #"\w+") (sort-by clojure.string/lower-case)) "Have a nice day.") ["a" "day" "Have" "nice"])

(= (#(->> % (re-seq #"\w+") (sort-by clojure.string/lower-case)) "Clojure is a fun language!") ["a" "Clojure" "fun" "is" "language"])

(= (#(->> % (re-seq #"\w+") (sort-by clojure.string/lower-case)) "Fools fall for foolish follies.") ["fall" "follies" "foolish" "Fools" "for"])
