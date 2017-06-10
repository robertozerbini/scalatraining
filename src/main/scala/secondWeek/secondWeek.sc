def sumNumber(f: Int => Int, a: Int, b: Int): Int =
   if (a>b) 0
   else f(b) + sumNumber(f,a,b-1)

sumNumber(x => x*x, 1,10)

def sumNumberTail(f: Int => Int, a: Int, b: Int): Int ={
  def loop(a: Int, acc: Int): Int = {
    if (a>b) acc
    else loop(a+1, acc+f(a))
  }
  loop(a,0)
}

sumNumberTail(x=> x*x*x, 1,10)

def prime(x:Int):Boolean ={
  def primeIter(count: Int): Boolean =
    if( x<=0 ) false
    else if ( count!=0 && count!=1 && x%count == 0  ) false
    else if (count>=x || x==1) true
    else primeIter(count+1)

  primeIter(1)
}

prime(11)
