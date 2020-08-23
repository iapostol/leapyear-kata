(ns leapyear.core_test
  (:require [clojure.test :refer :all]
            [leapyear.core :refer :all]))

(defn leap-year? [year]
  (if (zero? (mod year 100))
    (zero? (mod year 400))
    (zero? (mod year 4))))

(deftest a-test
  (testing "A year is not a leap year if is not divisible by 4"
    (is (= (leap-year? 1995) false)))

  (testing "A year is a leap year if is divisible by 4"
    (is (= (leap-year? 1996) true)))

  (testing "A year is a leap year if is divisible by 400"
    (is (= (leap-year? 1600) true)))

  (testing "A year is a leap year if is divisible by 100 but not by 400"
    (is (= (leap-year? 1800) false))))
