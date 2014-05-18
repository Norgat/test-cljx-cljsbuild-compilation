(ns compile-test.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(gen-class
 :name "HelloWorld")

(defn -foo [this]
  "UUUUU")
