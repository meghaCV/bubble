package pid.exercise.sort;

public class SelectionSort {

    public static int[] sort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            int minIndex =i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            int temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
        return array;
    }
     


public static void printArray(int[] array){
     for(int i=0;i<array.length;i++){
         System.out.println(array[i]);
    }

}
}