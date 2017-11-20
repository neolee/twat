(ns twat.sandbox)

(require '[clojure.data.csv :as csv]
         '[clojure.java.io :as io]
         '[clojure.java.jdbc :as jdbc])

(with-open [tweets-file (io/reader "../data/tweets.csv")]
  (nth (csv/read-csv tweets-file) 1000))

(def db
  {:classname   "org.sqlite.JDBC"
   :subprotocol "sqlite"
   :subname     "../data/tweets.db"
   })

(def rs
  (jdbc/query db "select * from tweets where in_reply_to_user_id='28954840'"))

(keys (first rs))
(:source (first rs))
(:text (first rs))

