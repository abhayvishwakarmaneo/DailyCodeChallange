public class MergeSortedArray {
    public static void main(String[] args) {
        int array1[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int array2[] = { 1, 8, 9, 10, 15 };
        int length = array1.length + array2.length;
        int mergedarray[] = new int[length];
        for(int i=0; i < array1.length; i++){
            if(array1[i]>0 && array1[i] != 0){
                mergedarray[i] = array1[i];
            }
        }

        for(int j = array1.length; j < mergedarray.length; j++){
            if(array2[j] > 0 && array1[j] != 0){
                mergedarray[j] = array2[j];
            }
        }

        for(int arr:mergedarray){
            System.out.println(arr);
        }
    }
}
