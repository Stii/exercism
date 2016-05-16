(ns bob
  (:require [clojure.string :as strng]))

(defn forceful?
  [statement]
  (and (= statement (strng/upper-case statement))
       (some #(Character/isLetter %) statement)))

(defn silence?
  [statement]
  (strng/blank? statement))

(defn question?
  [statement]
  (= (last statement) \?))


(defn response-for
  ([] (response-for " "))
  ([statement]
  (cond
   (forceful? statement) "Whoa, chill out!"
   (question? statement) "Sure."
   (silence? statement) "Fine. Be that way!"
   :else "Whatever.")))
