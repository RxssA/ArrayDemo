package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

        public static void main(String[] args) {
            ArrayList<Integer> myList = new ArrayList<Integer>();



            myList.add(100);
            myList.add(200);
            myList.add(300);
            myList.add(400);
            myList.add(500);
            myList.add(600);
            myList.add(700);
            myList.add(800);
            myList.add(900);
            myList.add(1000);
            loop(myList);
            Scanner myScan = new Scanner(System.in);

            try{
                System.out.println("Enter a new value:");
                myList.add(myScan.nextInt());
                loop(myList);


            }
            catch (Exception e){
                System.out.println("No more room in the inn! (The Array is full)");
            }
        }
    public static void loop(ArrayList<Integer> someArrayList){
        int indexValue = 0;
        for(int value: someArrayList)
        {
            System.out.println("Element at index "+indexValue+":"+value);
            indexValue++;
        }


    }
        }



