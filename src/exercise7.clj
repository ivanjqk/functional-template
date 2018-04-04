(ns exercise7)

(defn fmap
	"Returns the result of applying \"function\" to each item in the list, vector, or map identified as \"collection\"."
	[function collection]
	(if (map? collection)
		(into {}
			(for [[k v] collection] [k (function v)]))
		(map function collection)))

