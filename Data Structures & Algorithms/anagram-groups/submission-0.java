class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> res = new HashMap<>(); //stores all anagrams and strings

        for(String s : strs){ //loop the string
            int [] count = new int[26]; //chararray to find the char present 
            for(char c : s.toCharArray()){ //loop in which string converted to char arrray
                count[c - 'a']++; //mark every char and add

            }
            String key = Arrays.toString(count); //make freq string to array
            res.putIfAbsent(key , new ArrayList<>()); //if not present make it new array
            res.get(key).add(s); //if present add current string to its grup

        }
        return new ArrayList<>(res.values());

        
    }
}
