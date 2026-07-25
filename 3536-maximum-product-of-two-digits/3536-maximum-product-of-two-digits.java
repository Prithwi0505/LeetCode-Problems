class Solution {
    public int maxProduct(int n) {
        List<Integer> lis = new ArrayList<>();
        while(n != 0){
            int d = n % 10;
            lis.add(d);
            n= n / 10;
        }
        int largest = 0;
        int largest2 = 0;
        for(int i = 0; i < lis.size(); i++){
            if(lis.get(i) >= largest){
                largest2 = largest;
                largest = lis.get(i);
            }
            else if(lis.get(i) > largest2 && lis.get(i) < largest){
                largest2 = lis.get(i);
            }
        }
        return largest * largest2;
    }
}