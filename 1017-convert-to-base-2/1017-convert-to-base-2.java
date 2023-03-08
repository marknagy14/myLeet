class Solution {




    



     public static String baseNeg2(int n) {

        if (n < 0) return null;
        if (n == 0) return "0";
        StringBuilder s= new StringBuilder();

        while (n != 0) {
            
            int r=n % -2;
            n = n / -2;
            if(r<0){
                r=r+2;
                n=n+1;
            }

            s.append(r);
        }
       

       return s.reverse().toString();

    }
}