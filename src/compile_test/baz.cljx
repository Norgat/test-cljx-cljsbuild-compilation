(ns compile-test.baz)


(defn baz []
  #+clj "BAAAAZ"
  #+cljs "ROOOOO")
