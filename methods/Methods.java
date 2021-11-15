class Methods{
   public static void main(String[] args){
       System.out.println(addition(10f,20f));
       System.out.println(substraction(10f,20f));
       System.out.println(division(10f,20f));
   }
   public static float addition(float a,float b){
     float c=a+b;
     return c;
   }
   public static float substraction(float a,float b){
     float c=a-b;
     return c;
   }
   public static float division(float a,float b){
     float c=a/b;
     return c;
   }
}