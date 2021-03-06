(ns predicates)

(defn sum-f 
  [f g x]
  (+ (f x) (g x)))

(defn less-than 
  [n]
  (fn [k] (< k n)))

(defn equal-to 
  [n]
  (fn [k] (= k n)))

(defn set->predicate 
  [a-set]
  (fn [x] (contains? a-set x)))


(defn pred-and 
  [pred1 pred2]
  (fn [x] (and (pred1 x) (pred2 x))))

(defn pred-or 
  [pred1 pred2]
  (fn [x] (true? (or (pred1 x) (pred2 x)))))

(defn whitespace? [character]
  (Character/isWhitespace character))

(defn blank? 
  [string]
  (or  
      (every? whitespace? string)        
      (empty? string)        
      (nil? string)))

(defn has-award? 
  [book award]
  (let [awards (book :awards)]
    (contains? awards award)))

(defn HAS-ALL-THE-AWARDS? 
  [book awards]
  (every? #(has-award? book %) awards))

(defn my-some [pred a-seq]
  :-)

(defn my-every? [pred a-seq]
  :-)

(defn prime? [n]
  :-)
;^^
