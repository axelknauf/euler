(ns euler.main-test
  (:require [clojure.test :refer :all]))

(defn my-fixture [block]
    (do
        (println "before test")
        (block)
        (println "after test")))

(use-fixtures :each my-fixture)

(deftest my-test
    (is (= 2 (+ 1 1))))

