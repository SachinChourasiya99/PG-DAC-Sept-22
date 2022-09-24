class APattern34{
 public static void main(String []args){
	int a=1;
  for(int i=5;i>0;i--){
	for(int j=1;j<i*2;j++){
     System.out.print(" ");
     } 
   for(int j=1;j<=a;j++){
    System.out.print(j+" ");
    }
   for(int j=a-1;j>=1;j--){
    System.out.print(j+" ");
	}
	
   System.out.println();
   a++;
  }
 }
}
