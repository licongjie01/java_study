package org.example.array1;

public class ArrayTest {
    public static void main(String[] args) {
        //数组的声明和初始化

        //声明数组 ageArray
        Integer[] ageArray;
        //定义数组ageArray 并写入三个值；数组长度为3 下标从0开始
        ageArray = new Integer[]{10, 20, 30};
        String[] nameArray;
        nameArray = new String[3];//数组长度3
        nameArray[0] = "张三";
        nameArray[1] = "李四";
        nameArray[2] = "王五";

        Student [] studentArray = new Student[]{new Student("zhangshan",10)
        ,new Student("lisi",20)
        ,new Student("wangwu",30)};

        printArray(ageArray);
        printArray(nameArray);
        printArray(studentArray);

    }
    public static void printArray(Object [] objects){
        if (objects instanceof Integer[] || objects instanceof String[]) {
            for (Object object : objects) {
                System.out.print(object + "\t");
            }
        } else {
            for (Object object : objects) {
                System.out.print(object.toString() + "\t");
            }
        }
        System.out.print("\n");
    }


}
