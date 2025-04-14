class PrimeNumber{
    public static void main(String args[]) {
        int a, i;
        a = Integer.parseInt(args[0]);
     if(a<=1)
     {
             System.out.println(a+ "is not a Prime number");
        return;
      }
      for(i=2;i<a;i++)
      {
      if(a%i==0)
      {
             System.out.println(a+ "is not a Prime number");
             return;
      }
      }
             System.out.println(a+ "is a Prime number");
             return;
      }
}
