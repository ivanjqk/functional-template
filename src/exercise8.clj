(ns exercise8)

(defn fderive
	"Returns an anonymus function that approximates the derivative of a \"function\" at a given \"point\" by means of the symmetric \"difference\" quotient."
	[function difference]
	(fn
		[point]
		(/
			(-
				(function (+ point difference))
				(function (- point difference)))
			(* 2 difference))))

