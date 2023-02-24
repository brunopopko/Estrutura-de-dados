public class MyBubbleSort {
    public static void main(String[] args) {
        int[] array = {5,3,8,2,6};
        int aux = 0;
        int i = 0;

        System.out.print("Array desordenado = { ");
        for(i = 0; i < 5; i++) {
            if(i==4) {
                System.out.print(array[i] + " }");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println(" ");

        for(i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                if(array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        System.out.println(" ");
        System.out.print("Array Ordenado = { ");
        for(i = 0; i < 5; i++) {
            if(i==4) {
                System.out.print(array[i] + " }");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
    }
}
