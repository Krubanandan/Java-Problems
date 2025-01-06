class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> uniq=new HashSet<>();
        for(char c: s.toCharArray()){
            uniq.add(c);
        }
        int count=0;
        for(char x:uniq){
            int left=s.indexOf(x);
            int right=s.lastIndexOf(x);
            HashSet<Character> temp=new HashSet<>();
            if(left!=right){
                for(int i=left+1;i<right;i++){
                    temp.add(s.charAt(i));
                }

            }
            count+=temp.size();
        }
        return count;
    }
}