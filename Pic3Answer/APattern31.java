class APattern31{
 public static void main(String []args){
	int a=1; 
  for(int i=9;i>0;i--){
	for(int j=1;j<=i;j++){
     System.out.print(" ");
    } 
   for(int j=1;j<=a;j++){
    System.out.print(a+" ");
   }
   System.out.println();
   a++;
  }
 }
}