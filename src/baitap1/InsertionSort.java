package baitap1;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {1,4,6,8,4,3,6,2,9};
        InsertionSort.insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d\t",list[i]);
        }
    }
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int curren = list[i];
            int j;
            for (j= i-1;j>=0&&list[j]>curren; j--) {
                list[j+1]=list[j];
            }
            list[j+1]=curren;
        }
    }
}
