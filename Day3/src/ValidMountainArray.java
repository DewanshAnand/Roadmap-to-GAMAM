public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {

        if(arr.length<3){
            return false;
        }

        int i=0;

        while(i<arr.length-2 && arr[i]<arr[i+1]){
            i++;
        }

        int j = arr.length-1;

        while(j>1 && arr[j]<arr[j-1]){
            j--;
        }

        return i==j;


    }
}
