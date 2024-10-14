package Arr;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
    ArrayList <Integer> marks = new ArrayList<Integer>();
    marks.add(55);
    marks.add(50);
    marks.add(75);
    marks.add(83);
    marks.add(99);
    System.out.print("Old Array : ");
    System.out.println(marks);
    marks.add(2,33);
    System.out.print("After inserting new element at index 2 : ");
    System.out.println(marks);
    marks.remove(0);
    System.out.print("After Deleting new element at index 0 : ");
    System.out.println(marks);
    marks.set(3, 100);
    System.out.print("After replacing an element at index 3 : ");
    System.out.println(marks);
    }
}