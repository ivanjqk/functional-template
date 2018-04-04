(ns exercise6
	(:require [exercise4 :as e4]))

(defn faverage
	"Returns the average value of items from \"collection\"."
	[collection]
	(/
		(e4/summary collection)
		(count collection)))

