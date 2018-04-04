(ns exercise10
	(:require [exercise4 :as e4] [exercise6 :as e6] [exercise7 :as e7]))

(defn fvariance
	"Returns the variance of a \"list\" of numbers."
	[list]
	(/
		(e4/summary
			(e7/fmap
				(fn
					[parameter]
					(* parameter parameter))
				(e7/fmap
					(fn
						[parameter]
						(- parameter (e6/faverage list)))
					list)))
		(count list)))

