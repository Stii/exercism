(ns rna-transcription)

;G -> C
;C -> G
;T -> A
;A -> U

(def dna-rna-map {\G \C
                  \C \G
                  \T \A
                  \A \U})

(defn transcribe?
  [dna-chr]
  (assert (contains? dna-rna-map dna-chr)))

(defn transcribe
  [dna-chr]
  (transcribe? dna-chr)
  (get dna-rna-map dna-chr))

(defn to-rna
  [dna-string]
  (apply str (map transcribe dna-string)))
