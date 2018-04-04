(ns exercise4)

(defn summary
	"Applies the function \"sum\" to all elements in \"collection\"."
	[collection]
	(reduce + collection))

