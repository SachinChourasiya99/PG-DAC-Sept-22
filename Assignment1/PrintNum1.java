class PrintNum1{
 // int a=1;
 static void Print(int a){ 

   if(a>10){
    return ;
   }
   else{
    System.out.println(a);
   a++;
   }
	Print(a);
  
 }
 
 public static void main(String []args){
  Print(1);
 }
}