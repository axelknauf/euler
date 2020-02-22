(ns euler.main-test
  (:require [clojure.test :refer :all]
            [euler.main :refer :all]))

(deftest euler-1-test
  (testing "should solve https://projecteuler.net/problem=1" 
    (is (= 23 (euler-1 10)))))

(deftest euler-2-test
  (testing "should solve https://projecteuler.net/problem=2")
    (is (= 10 (euler-2 22))))
