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

(defn -main []
  (println (euler-1 1000))
  (println (euler-2 4000000)))
