(ns euler.main)

(defn euler-1 [threshold] 
  (->> (range threshold)
       (filter #(or (= 0 (mod % 3))
                    (= 0 (mod % 5))))
       (reduce +)))

(defn- fibonacci []
  ((fn rfib [a b]
       (cons a (lazy-seq (rfib b (+ a b)))))
    0 1))

(defn euler-2 [threshold]
  (->> (take-while #(<= % threshold) (fibonacci))
       (filter even?)
       (reduce +)))

; https://en.wikipedia.org/wiki/Trial_division
(defn prime-factors [n] 
  (loop [factors []
         cur n
         i 2]
    (if (<= cur 1)
      factors
      (if (= 0 (mod cur i))
        (recur (cons i factors) (/ cur i) i)
        (recur factors cur (+ 1 i))))))

(defn euler-3 [n] 
  (apply max (prime-factors n)))

(defn -main []
  (println (euler-1 1000))
  (println (euler-2 4000000))
  (println (euler-3 600851475143)))
