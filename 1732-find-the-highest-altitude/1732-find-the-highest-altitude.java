class Solution {
    public int largestAltitude(int[] gain) {
        int highest = Integer.MIN_VALUE;
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        for(int i = 0; i < gain.length; i++){
            arr[i+1] = arr[i] + gain[i];
            highest = Math.max(highest, arr[i]);
        }
        highest = Math.max(highest, arr[arr.length - 1]);
        return highest;
    }
}