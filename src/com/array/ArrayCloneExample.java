package com.array;

import com.util.utilClass.Student;

import java.util.Arrays;

public class ArrayCloneExample {

    public static void getData(Student[] stus){
        stus[0] = new Student("WW", 27, 95);
        stus[1] = new Student("SS", 34, 96);
        stus[2] = new Student("CC", 65, 92);
    }

    public static void cloneTest(){
        System.out.println("Clone() Method Test:");
        int[] arr = new int[]{1, 2, 3, 4};
        int[] arrClone = arr.clone();
        arrClone[0] = -1;
        System.out.println("Primitive Data Type Test:");
        System.out.printf("After Modification, arr[0] = %d, arrClone[0] = %d\n", arr[0], arrClone[0]);
        System.out.println("Object Data Type Test:");
        Student[] stus = new Student[3];
        getData(stus);
        Student[] stusClone = stus.clone();
        stusClone[0].setAge(16);
        System.out.printf("After Modification, stus[0] = %s, stusClone[0] = %s\n", stus[0], stusClone[0]);
    }

    public static void arrayCopyTest(){
        System.out.println("arrayCopy() Method Test:");
        int[] arr = new int[]{1, 2, 3, 4};
        int[] arrClone = new int[arr.length];
        System.arraycopy(arr, 0, arrClone, 0, arrClone.length);
        arrClone[0] = -1;
        System.out.println("Primitive Data Type Test:");
        System.out.printf("After Modification, arr[0] = %d, arrClone[0] = %d\n", arr[0], arrClone[0]);
        Student[] stus = new Student[3];
        getData(stus);
        Student[] stusClone = new Student[3];
        System.arraycopy(stus, 0, stusClone, 0, 3);
        stusClone[0].setAge(16);
        System.out.println("Object Data Type Test:");
        System.out.printf("After Modification, stus[0] = %s, stusClone[0] = %s\n", stus[0], stusClone[0]);
    }

    public static void copyOfRangeTest(){
        System.out.println("copyOfRange() Method Test:");
        int[] arr = new int[]{1, 2, 3, 4};
        int[] arrClone = Arrays.copyOfRange(arr, 0, 4);
        arrClone[0] = -1;
        System.out.println("Primitive Data Type Test:");
        System.out.printf("After Modification, arr[0] = %d, arrClone[0] = %d\n", arr[0], arrClone[0]);
        Student[] stus = new Student[3];
        getData(stus);
        Student[] stusClone = Arrays.copyOfRange(stus, 0, 3);
        stusClone[0].setAge(16);
        System.out.println("Object Data Type Test:");
        System.out.printf("After Modification, stus[0] = %s, stusClone[0] = %s\n", stus[0], stusClone[0]);
    }

    public static void main(String[] args) {
        cloneTest();
        arrayCopyTest();
        copyOfRangeTest();
    }
}
