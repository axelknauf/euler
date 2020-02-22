(ns euler.main-test
  (:require [clojure.test :refer :all]
            [euler.main :refer :all]))

(deftest euler-1-test
  (testing "should solve Euler no. 1" 
    (is (= 23 (euler-1 10)))))

