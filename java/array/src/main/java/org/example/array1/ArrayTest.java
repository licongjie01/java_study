package org.example.array1;

public class ArrayTest {
    public static void main(String[] args) {
        //数组的声明和初始化

        //声明数组 ageArray
        int [] ageArray;
        //定义数组ageArray 并写入三个值；数组长度为3 下标从0开始
        ageArray = new int []{10,20,30};
        String[] nameArray;
        nameArray = new String[3];//数组长度3
        nameArray[0] = "张三";
        nameArray[1] = "李四";
        nameArray[2] = "王五";
    }
    class Student{
       private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
