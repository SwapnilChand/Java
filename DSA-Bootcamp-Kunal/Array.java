public class Array{
    public static void main(String[] args) {

        int nums[] = {1,2,1};
        int newnum[] = new int[nums.length * 2];
        //n = 6
        for(int i = 0, j = 0; i <= newnum.length - 1; i++,j++){
            //i <= 5 
            if(i == nums.length - 1)//i==3
                j = 0;
            newnum[i] = nums[j];//newnum = [1,2,1]
            System.out.println(newnum[i]);
        }
        System.out.println("_________________");
        for(int i=0; i <= newnum.length - 1;i++)
            System.out.print(newnum[i] + " ");
    }
}
