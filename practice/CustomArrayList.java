package practice;

import java.util.Arrays;

public class CustomArrayList {
    private int[] arr;
    private static int defSize = 10;
    private int size = 0;

    public CustomArrayList() {
        this.arr = new int[defSize];
    }

    private void add(int num) {
        if (isFull()) {
            resize();
        }
        arr[size++]=num;
    }

    private void resize() {
        int[] temp=new int[arr.length*2];

        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        
        arr=temp;
    }

    private boolean isFull() {
        if(arr.length==size){
            return true;
        }
        return false;
    }
    private void showArr(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        CustomArrayList list=new CustomArrayList();
        CustomArrayList list2=new CustomArrayList();
        for (int i = 0; i < 15; i++) {
            list2.add(i);
            
        }
        list.add(5);
        

        
        list.showArr();
        list2.showArr();
        System.out.println(list.size);
    }
}
