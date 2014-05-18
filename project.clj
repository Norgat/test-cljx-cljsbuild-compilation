(defproject compile-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "1.0.2"]
            [com.keminglabs/cljx "0.3.2"]]

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2173"]]

  :hooks [cljx.hooks leiningen.cljsbuild]
  :aot [compile-test.core]

  :cljsbuild
  {:builds [{
             :source-paths ["src"]
             :compiler
             {:output-to "resources/js/main.js"
              :optimizations :whitespace
              :pretty-print true}}]}


  :cljx {:builds [{:source-paths ["src"]
                   :output-path "src/gen"
                   :rules :clj}
                  {:source-paths ["src"]
                   :output-path "src/gen"
                   :rules :cljs}]})
