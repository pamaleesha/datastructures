package c;

public class bubblesort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        bubbleSort(arr);
	        System.out.println("Sorted array:");
	        printArray(arr);
	    }

	    static void bubbleSort(int[] args) {
	        int n = args.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (args[j] > args[j + 1]) {
	                    
	                    int temp = args[j];
	                    args[j] = args[j + 1];
	                    args[j + 1] = temp;
	                }
	            }
	        }
	    }

	    static void printArray(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
		

	}


