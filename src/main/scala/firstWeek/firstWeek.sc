
def abs(x:Double)= if (x<0) -x else x

def sqrt(x:Double)={

def sqrtIter (guess:Double):Double=
     if (isGoodEnough(guess)) guess
     else sqrtIter(improve(guess))

def isGoodEnough(guess:Double)=
    abs(guess*guess -x)/x<0.00001

def improve(guess:Double)=
  (guess+x/guess)/2

 sqrtIter(1.0)
}

sqrt(2)
sqrt(4)
sqrt(1e-6)
sqrt(1e60)

def factorial (n:Int):Int ={
  def factorialIter(sum:Int, count:Int):Int =
    if (count==0) sum else factorialIter(sum*count,count-1)

  factorialIter(1,n)
}

factorial(4)

