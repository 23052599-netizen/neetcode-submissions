class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stck = new Stack<>();
        for(String c : operations){
            if(c.equals("+")){
                int top = stck.pop();
                int newtop = top + stck.peek();
                stck.push(top);
                stck.push(newtop);

            }else if(c.equals("D")){
                stck.push(2*stck.peek());

            }else if(c.equals("C")){
                stck.pop();

            }else {
                stck.push(Integer.parseInt(c));

            }
        }
        int sum= 0 ;
        for(int s : stck){
            sum += s;
        }
        return sum;
        
    }
}