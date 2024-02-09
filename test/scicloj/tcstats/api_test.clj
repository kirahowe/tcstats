(ns scicloj.tcstats.api-test
  (:require
   [clojure.test :refer [deftest testing is]]
   [scicloj.tcstats.api :as sut]
   [tablecloth.api :as tc]))

(def demo-ds
  (tc/dataset {:C1 [1 2 3 4 5]
               :C2 [2 5 6 9 10]}))

(deftest correlation-test
  (testing "correlation calculation works"
    (is (= 0.9853292781642932 (sut/correlation demo-ds :C1 :C2)))))
