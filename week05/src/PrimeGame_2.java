import java.util.Scanner;

public class PrimeGame {
    public static boolean isPrime(int n){

        return true;
    }
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int number = sc. nextInt();
        for(int i=2; i<=Math.sqrt(number);i=i+1){
            if(number % i == 0){
                counter++;
                break;
            }
            //System.out.print(i+" ");
        }
        if(counter == 0){
            System.out.println(number + " is prime number");
        }else{
            System.out.println(number + " is not prime number");
        }



}}
