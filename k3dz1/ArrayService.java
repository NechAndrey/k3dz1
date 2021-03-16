package k3dz1;

import java.util.ArrayList;
import java.util.List;

public class ArrayService<T> {
    public T[] copyEl(T[] arr, int index, int index2){
        if(arr.length > 0 && arr.length > index && arr.length > index2){
           T val = arr[index];
           T of = arr[index2];

           arr[index] = of;
           arr[index2] = val;
        }
        return arr;
    }

    public List<T> toArrayList(T[] arr){
        List<T> list = new ArrayList<>();
        if(arr.length > 0){
            for (T e: arr) {
               list.add(e);
            }
        }
        return list;
    }
}
