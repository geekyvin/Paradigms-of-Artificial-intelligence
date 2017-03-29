(ns paip.1
  (:require [clojure.string :as str]))

;;--------------------------------------------------------------------------
;; 1.1 Define a verison of last-name...
;;--------------------------------------------------------------------------

(defn suffix? [x]
  (let [suffix-set (list '"mr" '"sr" '"md" '"jr")]
    (some #(= x %) suffix-set)))

;;(suffix? 'mr)

(defn not-suffix? [x]
  (not (suffix? x)))

(defn find-last-name [name]
   (first (filter #(not-suffix? (str %)) (reverse (re-seq #"\w+" name)))))

;;(reverse (re-seq #"\w+" "Robert Downey jr"))

;;(filter #(not-suffix? (str %)) ['"jr" 'Downey 'Robert])

;;(not-suffix? 'jr)

(find-last-name "Robert Downey jr")

;;----------------------End of Exercise 1.1----------------------------------
;; 1.2 Program to Exponeniate
;;---------------------------------------------------------------------------


;;(reduce * [3 3])

;;(reduce * (repeat 4 3))

(defn power [x y]
  (reduce * (repeat y x)))

(power 2 12)
