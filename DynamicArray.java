package com.company.day1;

public class DynamicArray {
    int size = 0;
    Object[] arrays = new Object[size];

    public Object[]  add(int k){
        Object[] newArr = new Object[size+1];
        for (int i = 0; i < newArr.length; i++) {
            if(i==size){
                newArr[i] = k;
            }else {
                newArr[i] = arrays[i];
            }
        }
        arrays = new Object[size+1];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = newArr[i];
        }
        size++;
        return arrays;
    }
    public Object[]  add(String k){
        Object[] newArr = new Object[size+1];
        for (int i = 0; i < newArr.length; i++) {
            if(i==newArr.length-1){
                newArr[i] = k;
            }else {
                newArr[i] = arrays[i];
            }
        }
        arrays = new Object[newArr.length];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = newArr[i];
        }
        size++;
        return arrays;
    }
    public Object[] add(char k){
        Object[] newArr = new Object[size+1];
        for (int i = 0; i < newArr.length; i++) {
            if(i==newArr.length-1){
                newArr[i] = k;
            }else {
                newArr[i] = arrays[i];
            }
        }
        arrays = new Object[newArr.length];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = newArr[i];
        }
        size++;
        return arrays;
    }
    public Object[] add(boolean k){
        Object[] newArr = new Object[size+1];
        for (int i = 0; i < newArr.length; i++) {
            if(i==newArr.length-1){
                newArr[i] = k;
            }else {
                newArr[i] = arrays[i];
            }
        }
        arrays = new Object[newArr.length];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = newArr[i];
        }
        size++;
        return arrays;
    }
    public Object[] add(double k){
        Object[] newArr = new Object[size+1];
        for (int i = 0; i < newArr.length; i++) {
            if(i==newArr.length-1){
                newArr[i] = k;
            }else {
                newArr[i] = arrays[i];
            }
        }
        arrays = new Object[newArr.length];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = newArr[i];
        }
        size++;

        return arrays;
    }
    //remove
    public Object[] remove(String k){
        boolean myBool = false;
        Object[] newArr = new Object[size];
        for (int i = 0; i < size; i++) {
            if(arrays[i].equals(k)){
                for (int j = i; j+1 < size; j++) {
                    newArr[j] = arrays[j+1];
                }
                size--;
                myBool = true;
                break;
            }else {
                newArr[i] = arrays[i];
            }
        }
        if(myBool==true){
        arrays = new Object[size-1];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = newArr[i];
        }}else {
            return arrays;
        }
        return arrays;
    }
    public Object[] remove(int k){
        boolean myBool = false;
        Object[] newArr = new Object[size];
        for (int i = 0; i < size; i++) {
            if(arrays[i].equals(k)){
                for (int j = i; j+1 < size; j++) {
                    newArr[j] = arrays[j+1];
                }
                size--;
                myBool = true;
                break;
            }else {
                newArr[i] = arrays[i];
            }
        }
        if(myBool==true){
            arrays = new Object[size];
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = newArr[i];
            }}else {
            return arrays;
        }
        return arrays;
    }
    public Object[] remove(char k){
        boolean myBool = false;
        Object[] newArr = new Object[size];
        for (int i = 0; i < size; i++) {
            if(arrays[i].equals(k)){
                for (int j = i; j+1 < size; j++) {
                    newArr[j] = arrays[j+1];
                }
                size--;
                myBool = true;
                break;
            }else {
                newArr[i] = arrays[i];
            }
        }
        if(myBool==true){
            arrays = new Object[size];
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = newArr[i];
            }}else {
            return arrays;
        }
        return arrays;
    }
    public Object[] remove(boolean k){
        boolean myBool = false;
        Object[] newArr = new Object[size];
        for (int i = 0; i < size; i++) {
            if(arrays[i].equals(k)){
                for (int j = i; j+1 < size; j++) {
                    newArr[j] = arrays[j+1];
                }
                size--;
                myBool = true;
                break;
            }else {
                newArr[i] = arrays[i];
            }
        }
        if(myBool==true){
            arrays = new Object[size];
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = newArr[i];
            }}else {
            return arrays;
        }
        return arrays;
    }
    public Object[] remove(double k){
        boolean myBool = false;
        Object[] newArr = new Object[size];
        for (int i = 0; i < size; i++) {
            if(arrays[i].equals(k)){
                for (int j = i; j+1 < size; j++) {
                    newArr[j] = arrays[j+1];
                }
                size--;
                myBool = true;
                break;
            }else {
                newArr[i] = arrays[i];
            }
        }
        if(myBool==true){
            arrays = new Object[size];
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = newArr[i];
            }}else {
            return arrays;
        }
        return arrays;
    }
    //size
    public int size(){
        return arrays.length;
    }
    //indexOf
    public int indexOf(String k){
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i].equals(k)){
                return i;
            }
        }
        return -1;
    }
}
