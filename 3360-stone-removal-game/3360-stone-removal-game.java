class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10) return false;
        int c =10;
        int a = 0;
        int b = 0;
        while(c > 0){
            
            if(c > n) return false;
             System.out.println(n);
            System.out.println(c);
            n -= c;
            c--;
            System.out.println(n);
            System.out.println(c);
            if(c > n) return true;
            
            n -= c;
            c--;
                        System.out.println(n);

        }
        return false;
    }
}