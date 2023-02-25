public class MyIsertionSort {
    public static void main(String[] args) {
        int[]array = {5,3,8,2,6};
        int i = 0;
        int aux = 0;
        int j = 0;

        System.out.print("Array Desordenado = { ");
        for(i = 0; i<5; i++){
            if(i==4){
                System.out.print(array[i] + " }");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println(" ");

        for(i = 1; i<5; i++){
            aux = array[i];
            j = i-1;
            while((j > -1) && (array[j] > aux)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = aux;
        }

        System.out.println(" ");
        System.out.print("Array Ordenado = { ");
        for(i = 0; i<5; i++){
            if(i==4){
                System.out.print(array[i] + " }");
            }else{
                System.out.print(array[i] + ", ");
            }
        }
    }
}
