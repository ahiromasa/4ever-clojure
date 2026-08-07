(ns p038)

(= ((fn [& args] (-> args sort last)) 1 8 3 4) 8)

(= ((fn [& args] (-> args sort last)) 30 20) 30)

(= ((fn [& args] (-> args sort last)) 45 67 11) 67)
