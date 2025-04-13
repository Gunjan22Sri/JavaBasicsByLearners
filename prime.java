public class prime{
public static void main(String[] args){
int num = 4;
boolean isPrime = true;
if (num <=1){
isPrime = false;
} else {
for(int i =2; i <= num/2; i++){
if(num % 1 == 0){
isPrime = false;
break;

}}}
if(isPrime){
System.out.println(num+ "is a prime number");
} else{
System.out.println(num + "is not a prime number");
}

}



}