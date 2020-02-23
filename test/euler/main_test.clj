(ns euler.main-test
  (:require [clojure.test :refer :all]
            [euler.main :refer :all]))

(deftest euler-1-test
  (testing "should add up numbers divisible by 3 or 5"
    (is (= 23 (euler-1 10)))))

(deftest euler-2-test
  (testing "should add up even numbers from Fibonacci sequence"
    (is (= 10 (euler-2 22)))))

(deftest euler-3-test
  (testing "should find highest prime factor"
    (is (= 29 (euler-3 13195))))
  (testing "should generate prime factors"
    (let [expected (sort [5 7 13 29])
          actual (sort (prime-factors 13195))]
      (is (= expected actual)))))
