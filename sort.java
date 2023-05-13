
package sıralaama.algoritmaları;

import java.util.Scanner;

public class SıralaamaAlgoritmaları {
    
    static void ınsertıon(int[] arr, int n){
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i-1]) {
                int temp = arr[i];
                for (int j = i; j > 0 && arr[j-1 ] > temp ; j--) {
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    
    
    static void selectıon(int[] arr , int n){
        //int indx , large;
        
        for (int i = 0; i < n; i++) {
            int large=arr[i];
            int indx=i;
            
            for (int j = i+1; j < n; j++) {
                if (arr[j] < large) {
                    large = arr[j];
                    indx = j;
                    
                }
                int temp = arr[i];
                arr[i]=large;
                large=temp;
            }
            
        }
        
    }
    
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    
    static int[] quic(int[] arr , int low , int high){
        if (high - low <= 1) return arr;
        int pvt = arr[high - 1];
        int split = low ;
        for (int i = low; i < high-1; i++) {
            if (arr[i] < pvt) {
                int temp = arr[i];
                arr[i] = arr[split];
                arr[split] = temp;
                split++;
            }
        }
        int temp2 = arr[high-1];
        arr[high-1] = arr[split];
        arr[split]= temp2;
        
        quic(arr, low, split);
        quic(arr, split+1, high);
        
        return arr;
    }
    
    
    
    
    
    public static void main(String[] args) {
        int[] arr = {35,61,48,72,96,13,74,66,70,24};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        
      
            
            
            System.out.println("");
            
            Scanner scn=new Scanner(System.in);
            System.out.println("1 ile 4 sayıları arasında bir sayı giriniz :");
            int sayı = scn.nextInt();
            while(sayı <=4 && sayı>0){
                if (sayı==1) {
                    System.out.println("\n ");
        
                    System.out.print("---BUBBLESORT---");
        
                    System.out.println(" ");


                    bubble(arr);
                    for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+",");
                    }
                    break;
                }
                else if (sayı==2) {
                    System.out.println("\n ");
        
                    System.out.print("***QUICSORT***");

                    System.out.println(" ");

                    quic(arr, 0, arr.length);

                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i]+",");
                    }
                    break;
                }
                else if (sayı==3) {
                    System.out.println("\n ");

                    System.out.println("///SELECTIONSORT///");

                    System.out.println(" ");
                    
                    selectıon(arr, arr.length);

                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i]+",");
                    }
                    break;
                }
                
                else if (sayı==4) {
                    System.out.println("\n");
        
                    System.out.print("+++INSERTIONSORT+++");

                    System.out.println(" ");

                    ınsertıon(arr, arr.length);

                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i]+",");
                    }
                    break;
                }
                
        }
    }
}
