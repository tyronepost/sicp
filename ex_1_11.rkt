#lang racket
(define (f x)
  (define (total a b c)
    (+ a (* 2 b) (* 3 c)))
  (define (f-iter a b c i)
    (if ( = i x) (total a b c)
        (f-iter (total a b c) a b (+ i 1)) ))
  (if (< x 3) x
      (f-iter 2 1 0 3)) )
