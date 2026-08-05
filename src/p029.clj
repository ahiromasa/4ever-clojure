(ns p029)

(= (#(->> % (re-seq #"[A-Z]") (apply str)) "HeLlO, WoRlD!") "HLOWRD")

(empty? (#(->> % (re-seq #"[A-Z]") (apply str)) "nothing"))

(= (#(->> % (re-seq #"[A-Z]") (apply str)) "$#A(*&987Zf") "AZ")
