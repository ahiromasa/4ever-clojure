(ns p083)

(= false (#(boolean (and (some true? %&) (some false? %&))) false false))

(= true (#(boolean (and (some true? %&) (some false? %&))) true false))

(= false (#(boolean (and (some true? %&) (some false? %&))) true))

(= true (#(boolean (and (some true? %&) (some false? %&))) false true false))

(= false (#(boolean (and (some true? %&) (some false? %&))) true true true))

(= true (#(boolean (and (some true? %&) (some false? %&))) true true true false))
