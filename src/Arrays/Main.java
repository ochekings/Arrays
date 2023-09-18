package Arrays;

public class Main{

    static int[] myArray = new int[4];
    int[] anotherArray = {7,88,9,8,4};

    public static void main(String[] args){

        Main myObject = new Main();
        for (int i = 0; i < myObject.anotherArray.length; i++){
            if (myObject.anotherArray[i] == 9){
                System.out.println("Found 9 at: "+i);
                break;
            }
        }
    }
}
