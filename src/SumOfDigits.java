public class SumOfDigits {
    public static int Sum(int n){
        if(n<10){
            return n;
        }
        return Sum(n%10 + Sum(n / 10));
    }
}
