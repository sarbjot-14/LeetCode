class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        //System.out.println(map.get('L'));
        
        int count = 0;
        for(int i=0; i<s.length(); i++ ){
            
            count+= map.get(s.charAt(i));
            if(i != s.length()-1){
                //System.out.println(s.charAt(i));
                if(s.charAt(i) == 'I' && (s.charAt(i+1)== 'V'||s.charAt(i+1)== 'X')){
                  count-=2;  
                  
                }
                else if(s.charAt(i) == 'X' && (s.charAt(i+1)== 'L'||s.charAt(i+1)== 'C')){
                  System.out.println(s.charAt(i));
                  count-=20;  
                  
                }
            else if(s.charAt(i) == 'C' && (s.charAt(i+1)== 'D'||s.charAt(i+1)== 'M')){
                  System.out.println(s.charAt(i));
                  count-=200;  
                  
                }
            
            
            }
            
            
            
        }
        return count;
    }
}