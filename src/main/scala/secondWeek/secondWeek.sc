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
