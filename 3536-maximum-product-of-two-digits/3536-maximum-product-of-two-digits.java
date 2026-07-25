class Solution {
    public int maxProduct(int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        while(n != 0){
            int d = n % 10;
            if(d >= max1){
                max2 = max1;
                max1 = d;
            }
            else if(d > max2 && d < max1) max2 = d;
            n= n / 10;
        }
        // int largest = 0;
        // int largest2 = 0;
        // for(int i = 0; i < lis.size(); i++){
        //     if(lis.get(i) >= largest){
        //         largest2 = largest;
        //         largest = lis.get(i);
        //     }
        //     else if(lis.get(i) > largest2 && lis.get(i) < largest){
        //         largest2 = lis.get(i);
        //     }
        // }
        return max1 * max2;
    }
}