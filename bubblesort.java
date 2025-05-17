public class bubblesort {

    static void swap(int [] array, int i, int j){
        int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }

    static void printarry(int [] arry){
        for(int i = 0; i < arry.length; i++){
            System.out.print(arry[i] + " ");
        }
    }

    static void sort(int [] array){
        for(int i = 0; i < array.length-1; i++){
            boolean flag = false;
            for(int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                   swap(array, j, j+1);
                   flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }
    
    public static void main(String[] args) {
        int array [] = {5,4,3,2,1};
        sort(array);
        printarry(array);
    }
}