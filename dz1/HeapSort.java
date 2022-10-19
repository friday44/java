// Реализовать алгоритм пирамидальной сортировки  (Heap Sort)

public class HeapSort {

    public static void main(String args[]) {
        int arr[] = {32, 10, 2, 42, 14, 76};

        System.out.println("Исходный массив");
        printArray(arr);

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Отортированный массив");
        printArray(arr);
    }

    public void sort(int arr[]) {
        int n = arr.length;

        // Построение из массива двоичной кучи
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

         // Замена элемента с наибольшим значением на последний элемент
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);   // Вызываем heapify на уменьшенной куче
        }
    }

    // Преобразование в двоичную кучу поддерева с родительским узлом i
    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Если самый большой элемент не родитель
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
        // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
