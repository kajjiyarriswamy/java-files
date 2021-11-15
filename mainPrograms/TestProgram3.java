//NAME:kAJJI YARRISWAMY
//PNO:9347639079
class TestProgram3{
   public static void main(String[] args){
    int a=0;
    int b=7;
     for(int i=1;i<=7;i++){
        if(i<=4){
         a++;
         b=b-2;
        }
        else{
          a--;
          b=b+2;
        }
        for(int j=1;j<=a;j++){
           System.out.print("*");
        }
        for(int k=1;k<=b;k++){
          System.out.print(" ");
        }
        for(int l=1;l<=a;l++){
          System.out.print("*");
        }
      System.out.println( );
     }
   }
}