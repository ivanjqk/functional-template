(ns exercise11)

(defn fmap-nil
	"Tests is the value associated to \"key\" in \"map\" is nil."
	[map key]
	(= (get map key) 'nil))

