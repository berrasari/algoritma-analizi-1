import java.util.Arrays;
import java.util.Random;


public class App {

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }}

    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }}

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int interpolationSearch(int[] integers, int elementToSearch) {

        int startIndex = 0;
        int lastIndex = (integers.length - 1);

        while ((startIndex <= lastIndex) && (elementToSearch >= integers[startIndex]) &&
                (elementToSearch <= integers[lastIndex])) {
            // using interpolation formulae to find the best probable position for this
            // element to exist
            int pos = startIndex + (((lastIndex - startIndex) /
                    (integers[lastIndex] - integers[startIndex])) *
                    (elementToSearch - integers[startIndex]));

            if (integers[pos] == elementToSearch)
                return pos;

            if (integers[pos] < elementToSearch)
                startIndex = pos + 1;

            else
                lastIndex = pos - 1;
        }
        return -1;
    }

   


    public static void main(String[] args) throws Exception {

        
        int[] dizi = new int[10000]; //sirali
        int[] dizi2 = new int[10000]; // ters sirali
        int[] dizi3 = new int[10001]; // random
        int random = 1 ;
        Random rdm = new Random();
        for (int i =0;i<10000;i++){
            dizi2[i]=10000-i;
            dizi[i] = random;
            dizi3[i] = rdm.nextInt(10000);
            
            random++;
        }
        

        double start = System.currentTimeMillis();
        selectionSort(dizi2);

        double elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Zaman:" + elapsedTime);
      

         start = System.currentTimeMillis();
         bubbleSort(dizi2);

         elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Zaman:" + elapsedTime);
        insertionSort(dizi2);

         start = System.currentTimeMillis();
        
      
        
        
         elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Zaman:"+elapsedTime);
    }
}
