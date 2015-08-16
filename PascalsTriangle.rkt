#lang racket

(provide getE)

(define (getE depth position)
  
  (cond ( (< depth 1) (raise-argument-error 'getE "d must be greater than 0" depth))
        ( (< position 1) (raise-argument-error 'getE "p must be greater than 0" position))
        ( (> position depth) (raise-argument-error 'getE "p must not be greater than d") depth position)
        ( (or (= position 1) (= position depth) ) 1)
        (else (+ (getE (- depth 1) (- position 1) )
                 (getE (- depth 1) position)))))