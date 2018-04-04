(ns exercise3)

(defn fibonacci
	"Calculates the Fibonacci number in the requested \"position\" of the Fibonacci sequence."
	[position]
	(if (< position 2)
		position
		(+
			(fibonacci (- position 1))
			(fibonacci (- position 2)))))

