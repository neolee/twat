(defproject twat "0.1.0"
  :description "twat: Tweet Archives Tool"
  :url "https://github.com/neolee/twat"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.4.0"]
                 [ch.qos.logback/logback-classic "1.2.3"]
                 [org.apache.commons/commons-math3 "3.6.1"]
                 [org.clojure/math.combinatorics "0.1.4"]
                 [org.clojure/math.numeric-tower "0.0.4"]
                 [org.clojure/data.csv "0.1.4"]
                 [org.clojure/java.jdbc "0.7.3"]
                 [org.xerial/sqlite-jdbc "3.21.0"]
                 ]
  :resource-paths ["resources"])
