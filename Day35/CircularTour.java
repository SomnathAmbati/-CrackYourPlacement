class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int p[], int d[])
    {
	    int n = p.length;
	    int s = 0;
	    int defects = 0;
	    int b = 0;
	    for(int i = 0; i < n; i++){
	        b += p[i] - d[i];
	        
	        if(b < 0){
	            s = i+1;
	            defects += b;
	            b = 0;
	        }
	    }
	    return b + defects >= 0? s : -1;
    }
}