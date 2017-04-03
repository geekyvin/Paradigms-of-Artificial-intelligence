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


;;---------------------------------------------------------------------------
;; 1.2 Program to Exponeniate
;;---------------------------------------------------------------------------


;;(reduce * [3 3])

;;(reduce * (repeat 4 3))

(defn power [x y]
  (reduce * (repeat y x)))

(power 2 12)

;;---------------------------------------------------------------------------
;; 1.3 Program to count atoms in the expression
;;---------------------------------------------------------------------------


(flatten ['a 'b 'c (list 'd 'e)])

(defn count-atoms [list]
  ((comp count flatten seq) list))

(count-atoms (list 'a  ['d 'e 'f] 'b 'c))


;;---------------------------------------------------------------------------
;; 1.4 Program to count frequencies of a symbol in list
;;---------------------------------------------------------------------------


(get ((comp frequencies flatten) '(a  [d e f] b c a)) 'a)

(defn count-anywhere [x list]
  (get ((comp frequencies flatten) list) x))

(count-anywhere 'a '(a  [a d e f] '(a b c) b c a a))


;;---------------------------------------------------------------------------
;; 1.5 Dot Matrix
;;---------------------------------------------------------------------------
;;                                        (3)
;; (dot-matrix (10 20) (3 4) =  (10 20) X (4) = 10 * 3 + 20 * 4
;;



(apply + (map * '(10 20) '(3 4)))

(defn dot-product [p-list]
;;  (do p-list))
  (apply + (map * (do p-list))))

(dot-product ['(10 20) '(3 4)])

