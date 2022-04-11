import java.util.HashMap;
public class fibDp {

    public static void main(String[] args){
        System.out.println(fibCalc(15)); // Enter fib number you would like to calculate
    }

    static HashMap<Integer,Integer> prevFib = new HashMap<Integer,Integer>();
    public static int fibCalc(int n){
        if(prevFib.containsKey(n)) return prevFib.get(n); //checks if we have already calculated n (cuts down runtime)
        if(n == 1) return 1; // return 1 base case
        if(n == 0) return 0; // return 0 base case
        int num = fibCalc(n-1) + fibCalc(n-2); // find fib number recursively 
        prevFib.put(n,num); // put in hm
        return num; // return nth fib number
    }

}
