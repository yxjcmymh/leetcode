class Cashier {
    private int n, count;
    private double discount;
    private Map<Integer, Integer> productMap = new HashMap<>();

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount/100.0;
        this.count = 0;

        for(int i = 0; i < products.length; i++) {
            this.productMap.put(products[i], prices[i]);
        }
    }

    public double getBill(int[] product, int[] amount) {
        count++;

        double checkout = 0;
        for(int i = 0; i < product.length; i++) {
            checkout += productMap.get(product[i]) * amount[i];
        }

        if(count == n) {
            checkout -= checkout * discount;
            count = 0;
        }

        return checkout;
    }
} // memory use: 61.6 MB (82.53%), runtime: 116 ms (65.06%)

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */
