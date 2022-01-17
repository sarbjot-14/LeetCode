import java.util.HashMap; // import the HashMap class

class Solution {
    Map<Integer, Integer> mem = new HashMap<>();
    public int fib(int n) {
        
        
    
                                    
       // RECURSIVE SOLUTION
        if(n == 0){
            return 0;
        }
        else if(n ==1){
            return 1;
        }
        else{
            if(mem.containsKey(n)){
                return mem.get(n);
            }
            else{
                mem.put(n,(fib(n-1) + fib(n-2)));
                return mem.get(n);
            }
            
        }
        
    }
}