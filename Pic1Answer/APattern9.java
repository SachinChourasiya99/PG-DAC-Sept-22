class APattern9{
 public static void main(String []args){
 int a=65;
  for(int i=0;i<=4;i++){
	for(int j=i;j<5;j++){
     System.out.print(" ");
    } 
   for(int j=0;j<=i;j++){
    System.out.print((char)(a+j)+" ");
        //a++;
   }
   System.out.println();
   
  }
 }
}