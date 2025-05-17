public class reversbubbleshort {

    static void swap(int [] array, int i, int j){
        int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
    }

    static void revers(int arry[]){
        int n = arry.length;

        for(int i = 0; i < n-1; i++){
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arry[j]<arry[j+1]) {
                    swap(arry,j,j+1);
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arry [] = {1,2,3,4,5};
        revers(arry);

        for(int i : arry){
            System.out.print(i + " ");
        }

    }
}
