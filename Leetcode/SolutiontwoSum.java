import java.util.Scanner;

public class SolutiontwoSum{

    public static int [] Sum(int [] array, int target){

        for(int i=0; i<array.length; i++){
            for(int j= i+1; j<array.length; i++){
                if(array[i]+array[j]==target){
                    return new int[] {i,j};
                }else{
                    System.out.println("Leider keine zwei Summen!");
                }
            }
        }
        return new int [] {};
    }


    public static void main(String [] args){

        Scanner Sc= new Scanner(System.in);


        System.out.println("Geben SIe ihren Zahl Ziel ein: ");
        int ziel= Sc.nextInt();

        int [] arr= new int[3];

        System.out.println("Geben Sie ihren 3 Arrayzahlen ein: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= Sc.nextInt();
        }


        int [] result= Sum(arr, ziel);


        for(int werte: result){
            System.out.println(werte);
        }
    }
}
    












