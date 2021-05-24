class SolutionLeet1351{
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int[] row:grid){
            int index=getFloor(row);
            count+=(row.length-index);
        }
        
        return count;
    }
    
    private static int getFloor(int[] row){
        
        int lo=0 ,hi=row.length-1;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(row[mid]>=0) lo=mid+1;
            else if(row[mid]<0) hi=mid-1;
            
        }
        return lo;
        
    }
}