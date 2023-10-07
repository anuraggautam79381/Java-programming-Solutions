class solution{
    public void moveszero(int[] nums){

     int size=nums.length;
     if(size==0||size==1)
     return;
    }
    
    int nz=0,z=0;
    while(nz<size){
     int temp=nums[nz];
     nums[nz]=nums[z];
     nums[z]=temp;
     nz++;
     z++;
    }
    else
    nz++;
}