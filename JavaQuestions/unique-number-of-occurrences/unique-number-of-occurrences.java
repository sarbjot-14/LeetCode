class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        HashSet<Integer> uniqueNums = new HashSet<Integer>(); 
        for(int i = 0 ; i < arr.length; i++){
            //System.out.println(i);
            if(count.containsKey(arr[i])){
                
                count.put(arr[i],count.get(arr[i]) +1);
            }
            else{
                count.put(arr[i],0);
            }
            
           
        }
        for (Integer value : count.values()) { 
            //System.out.println(value);
            if(uniqueNums.contains(value)){
                return false;
            }
            else{
                uniqueNums.add(value);
            }
        }
        
        return true;
    }
}