class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int n = pizzas.length;
        int days = n/4;

        int odd = (days+1) / 2;
        int even = days / 2;

        long sum = 0;

        int right = n-1;

        for(int i = 1; i <= odd; i++){
            sum += pizzas[right];
            right--;
        }

        for(int i = 1; i <= even; i++){
            right--;
            sum += pizzas[right];
            right--;
        }
        return sum;
    }
}