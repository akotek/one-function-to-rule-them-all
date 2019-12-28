(ns one-function-to-rule-them-all)

(defn concat-elements [a-seq]
  (reduce concat () a-seq))

(defn str-cat [a-seq]
  (if (empty? a-seq) "")
  (reduce (fn [x y] (str x " " y)) a-seq))

(defn my-interpose [sep a-seq]
  (if (empty? a-seq)
    a-seq
    (reduce (fn [e1 e2] (if (empty? e1)
                          (conj e1 e2)
                          (conj e1 sep e2))) [] a-seq)))

(defn my-count [a-seq]
  (reduce (fn [acc e] (inc acc)) 0 a-seq))

(defn my-reverse [a-seq]
  (reduce conj () a-seq))

(defn min-max-element [a-seq]
  [:-])

(defn insert [sorted-seq n]
  [:-])

(defn insertion-sort [a-seq]
  [:-])

(defn parity [a-seq]
  [:-])

(defn minus
  ([x] (- x))
  ([x y] (- x y)))

(defn count-params [& more]
  (count more))

(defn my-*
  ([] 1)
  ([x] x)
  ([x y] (* x y))
  ([x y & more]
   (reduce my-* (my-* x y) more)))

(defn pred-and [x]
  (fn [x] :-))

(defn my-map [f a-seq]
  [:-])