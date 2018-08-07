One way of describing combine- all is that it calculates the crossproduct
of the function append on the argument lists. Write the higher-order function
cross-product, and define combine-a11 in terms of it.
The moral is to make your code as general as possible, because you never know what
you may want to do with it next.

(defun cross-product (fn xlist ylist)
  "Return a l i s t of all (fn x y) values."
  (mappend #' (1 ambda (y)))
  (mapcar #'(lambda (x) (funcall f n x y)))

xlist
ylist  

(defun combine-all ( x list ylist)
  "Return a l i s t of l i s t s formed by appending a y t o an x"
  (cross-product #'append xlist ylist ))

Now we can use the cross - product in other ways as well:
-> (cross-product #'+ '(1 2 3) '(10 20 30))
(11 12 13
21 22 23
31 32 33)
-> (cross-product #'list '(a b c d e f g h)
'(1 2 3 4 5 6 7 8))
((A 1) (B 1) (C 1) (D 1) (E 1) (F 1) (G 1) (H 1)
(A 2) (B 2) (C 2) (D 2) (E 2) (F 2) (G 2) (H 2)
(A 3) (B 3) (C 3) (D 3) (E 3) (F 3) (G 3) (H 3)
(A 4) (B 4) (C 4) (D 4) (E 4) (F 4) (G 4) (H 4)
(A 5) (B 5) (C 5) (D 5) (E 5) (F 5) (G 5) (H 5)
(A 6) (B 6) (C 6) (D 6) (E 6) (F 6) (G 6) (H 6)
(A 7) (B 7) (C 7) (D 7) (E 7) (F 7) (G 7) (H 7)
(A 8) (B 8) (C 8) (D 8) (E 8) (F 8) (G 8) (H 8)
