class Solution {
    String[] below10 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] below20 = {"Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] Tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    public String numberToWords(int n) {
        
        if(n == 0)  return "Zero";
        if(n < 10){
            return below10[n];
        }
        if(n < 20){
            return below20[n-10];
        }
        if(n < 100){//75
            return Tens[n / 10] + (n % 10 != 0?" "+ below10[n%10] : "");
        }
        if(n < 1000){//999
            return below10[n / 100] + " Hundred" + (n % 100 != 0?" " + numberToWords(n % 100) : "");
        }
        if(n < 1000000){//999999
            return numberToWords(n / 1000) + " Thousand" + (n % 1000 != 0? " " + numberToWords(n % 1000) : "");
        }
        if(n < 1000000000){//999999999
            return numberToWords(n / 1000000) + " Million" + (n % 1000000 != 0?" " + numberToWords(n % 1000000) : "");
        }
        return numberToWords(n / 1000000000) + " Billion" + (n % 1000000000 != 0?" " + numberToWords(n % 1000000000) : "");
    }
}