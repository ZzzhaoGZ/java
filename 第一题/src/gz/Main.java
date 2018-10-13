package gz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        int num,value;
        /*
        从键盘键入数组
         */
        System.out.print("请输入有序数列:  ");
        Scanner sc=new Scanner(System.in);
        String inputStr=sc.nextLine();
        String[] strArr=inputStr.split(" ");
        int[] a=new int[inputStr.length()];
        for(int i=0;i<strArr.length;i++){
            a[i]=Integer.parseInt(strArr[i]);
        }
        num=strArr.length;
        System.out.print("请输入待搜索的数字:  ");
        Scanner scInt=new Scanner(System.in);
        value=scInt.nextInt();

        BinarySearchChanged.binarySearchChanged(a,value,0,num-1);


    }
}

