(ns exercise9)

(defn things
	"Return a string that states the \"parameter\" type, or \"default\" for java types other than Strings."
	[parameter]
	(if (re-matches #"^class java\..*" (str (type parameter)))
		(if (re-matches #"^class java\.lang\.String$" (str (type parameter)))
			(str "Soy un String")
			(str "Soy un default"))
		(str "Soy un " (re-find #"[A-Z][a-z]*$" (str (type parameter))))))

