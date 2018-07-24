class Solution {
    public String reverseVowels(String s) {
        char[] list = s.toCharArray();
        Set<Character> ref = new HashSet<>(Arrays.asList(new Character[]{'a','e','i','o','u','A','E','I','O','U'}));
        
        for(int i = 0,j = list.length-1;i<j;){
            if(!ref.contains(list[i])){
                i++;
                continue;
            }
            if(!ref.contains(list[j])){
                j--;
                continue;
            }
            char tmp = list[i];
            list[i] = list[j];
            list[j] = tmp;
            i++;
            j--;
        }
        return String.valueOf(list);
    }
}