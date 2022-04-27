object fizzbuzz
{
  def main(args:Array[String])=
  {
    var msg="";
    for(i<-Range(1,101))
    {
      if(i%3==0) msg+="Fizz";
      if(i%5==0) msg+="Buzz";
      if(msg.length>0) println(msg);
      else println(i);
      msg="";
      }
    }
}
