package coursera.sorting.MergeSort;

public class MergeSort {

    public static void main (String [] args) {
        int [] a = new int [] {5,7,1,3,8,10,0};
        MergeSort o = new MergeSort();
        o.sort(a);
        for (int i : a ) {
            System.out.print(i + " ");
        }
    }

    public void sort (int [] a) {
        int [] aux = new int [a.length];
        for (int i = 0 ; i< a.length; i++) {
            aux[i] = a[i];
        }
        sort (a, aux, 0, a.length -1);
    }

    public void sort (int []a,int []aux, int low, int high ) {
        if (low < high) {
            int mid = low + (high - low)/2;
            System.out.println("sort : low : " + low + " mid :" + mid +  " high : " + high );
            sort (a, aux, low, mid);
            sort (a,  aux, mid + 1, high);
            mergeSort(a, aux, low, mid, high);
        }
    }

    public void mergeSort (int [] a, int [] aux, int low, int mid, int high){
        System.out.println("mergeSort : low : " + low + " mid :" + mid +  " high : " + high );

        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > high) a[k] = aux[i++];
            else if (aux[j] < aux[i]) a[k] = aux[j++];
            else a[k]= a[i++];
        }
    }
//    private static boolean less(Comparator c, Object v, Object w)
//    { return c.compare(v, w) < 0; }
}
