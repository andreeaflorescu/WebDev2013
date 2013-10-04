;; DrRacket, version 5.3.5
;; Language: Pretty Big
;; FLORESCU ANDREEA

(require (lib "trace.ss"))
(require racket/list)

;; ============================== APPLY-FUNCTIONS ==============================
;; ============================================================================= 

(define (apply-functions number list)
  ;; check if the variable number is actually an Integer
  ;; check if the list of functions is empty
  (if (or (null? list) (not (integer? number)))
      '()
      (map (lambda(function) (function number)) list))) 
;; ================================== TEST FUNCTIONS ===========================
;; =============================================================================

(define (addOne number)
  (+ number 1))

(define (substractOne number)
  (- number 1))

(define (addTwo number)
  (+ number 2))

(define (multiplyByTwo number)
  (* number 2))

(define (superfergelicious number)
  (- (* 4 (+ number 5)) 1))

(define (answer? number)
  42)


;; ============================== TEST VARIABLES ===============================
;; =============================================================================
  
(define functions (list addOne addTwo))
(define functions1 (list  addOne multiplyByTwo addTwo))
(define functions2 (list answer?))
(define functions3 (list substractOne superfergelicious addOne multiplyByTwo))
(define functions4 (list addOne substractOne addTwo multiplyByTwo
                         superfergelicious answer?))


;; ================================== TEST CASES ===============================
;; =============================================================================

;; 1. Invalid Input
(apply-functions "Samurai Apocalypse" functions)
(apply-functions "Game of Trolls" '())
;; 2. Null Input
(apply-functions '() '())
;; 3. Multiple size subsets
(apply-functions 10 functions)
(apply-functions 100 functions1)
(apply-functions 1000 functions2)
(apply-functions 100 functions3)
(apply-functions 10 functions4)