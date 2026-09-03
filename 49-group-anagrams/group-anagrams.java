class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String , List>map=new HashMap<>();

    for(String s:strs){
        int[] count=new int[26]; //making a new array of 26 integers
       
       for(char c:s.toCharArray()){
        count[c-'a']++; //count and increase the number of repitiotions each character does 
       }

       StringBuilder sb= new StringBuilder();
       for(int i :count){
        sb.append("#");
        sb.append(i);
       }
    String key=sb.toString();
       if(!map.containsKey(key)){
        map.put(key,new ArrayList<String>());
       }
       map.get(key).add(s);
    }
    return new ArrayList(map.values());

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna