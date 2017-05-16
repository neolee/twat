(ns twat.sandbox)

(require '[clojure.data.csv :as csv]
         '[clojure.java.io :as io])

(with-open [tweets-file (io/reader "../data/tweets.csv")]
  (doall
   (csv/read-csv tweets-file)))
