class Solution {
    public long arrToNum(int[] arr){
        long res = 0;
        for(int d : arr){
            res = (res * 10) + d;
        }
        return res;
    }
    public int[] reverseArr(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
    public long smallestNumber(long num) {
        if (num == 0) return 0;
        long num2 = num;
        if(num < 0){
            num2 = Math.abs(num);
        }
        String nums = String.valueOf(num2);
        int n = nums.length();
        int[] arr = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            arr[j++] = Character.getNumericValue(nums.charAt(i));
        }
        Arrays.sort(arr);
        if(num > 0){  
            int i = 0;
            while(i < arr.length && arr[i] == 0){
                i++;
            }
            if (i != 0){
                arr[0] = arr[i];
                arr[i] = 0;
            }
            return arrToNum(arr);
        }
        else{
            reverseArr(arr);
            return -1 * arrToNum(arr);
        }
    }
}