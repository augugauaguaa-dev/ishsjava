public class PrimeGame_2 {

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }else{
            for(int i=2; i<=Math.sqrt(n); i=i+1){
                if(n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {111, 977, 1, 2, 53, 1200};  // 배열


        for(int number : numbers){//범위기반 for문 ranged based for
            if(isPrime(number)){
                System.out.println(number + " is a prime number~");
            }else{
                System.out.println(number + " is NOT prime number!");
            }

        }
//        for(int i=0; i<6; i++){
//            if(isPrime(numbers[i])){
//                System.out.println(numbers[i] + " is a prime number~");
//            }else{
//                System.out.println(numbers[i] + " is NOT prime number!");
//            }
//
//        }
    }
}
