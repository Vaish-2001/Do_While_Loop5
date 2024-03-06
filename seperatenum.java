class seperatenum
 {
  public static void main(String[]args)
   {
    int a =1234;
     do
     {
      int r=0;
      r=a%10;
      if(r%2==0)
       {
        System.out.println(r);
       }
     a=a/10;
     }while(a>0);
  }
 }//output:4,2