class ProductOfNumbers {
    ArrayList <Integer> al = new ArrayList<>();
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        al.add(num);
    }
    
    public int getProduct(int k) {
        int ans = 1;
        int i= al.size()-1;
        while(k != 0){
            
            ans *= al.get(i--);
            k--;
        }
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */