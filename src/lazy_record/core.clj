(ns lazy-record.core)

(defdb mydb {:classname "org.sqlite.JDBC"
                    :subprotocol "sqlite"
                    :subname "db/mydb.sqlite3"})        ;; Location of the db

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
