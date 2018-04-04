(ns exercise2)

(defn only-greater-than-five
	"Filters numbers in a \"list\" and returns only those that are greater than five (in a list)."
	[list]
	(filter
		(fn
			[y]
			(> y 5))
		list))

