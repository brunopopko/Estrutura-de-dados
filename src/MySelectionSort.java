public class MySelectionSort {
    public static void main(String[] args) {
        int[] array = {5,3,8,2,6};
        int i, j;
        int min, temp;
        
        System.out.print("Array Desordenado = { ");
        for(i = 0; i<5; i++) {
            if(i==4) {
                System.out.print(array[i] + " }");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println(" ");

        for(i = 0; i < 5-1; i++) {
            min = i;
            for(j = i+1; j < 5; j++) {
                if(array[j] < array[min])
                min = j;
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println(" ");
        System.out.print("Array Ordenado = { ");
        for(i = 0; i<5; i++) {
            if(i==4) {
                System.out.print(array[i] + " }");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
    }
}
