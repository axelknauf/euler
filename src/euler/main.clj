(ns euler.main)

(defn euler-1 [threshold] 
  (->> (range threshold)
       (filter #(or (= 0 (mod % 3))
                    (= 0 (mod % 5))))
       (reduce +)))

(defn -main []
  (println (euler-1 1000)))
