(ns scicloj.tcstats.api
  (:require [fastmath.stats :as stats]))

(defn correlation [ds col1 col2]
  (stats/correlation (get ds col1) (get ds col2)))
