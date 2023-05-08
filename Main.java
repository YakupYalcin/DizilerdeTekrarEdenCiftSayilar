import java.util.Arrays;

public class Main {

    static boolean isEvenNumberAndEqual(int [] arr,int value){
        for (int i: arr) {
            if (i == value ){
                return true;
            }else if (value % 2 != 0){
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        int [] arr1 = {12,31,25,65,21,31,12,24,35,24,98,64,64};
        int [] dublicate=new int [arr1.length];
        int dublicateStartIndex=0;



        for (int i = 0 ; i< arr1.length;i++){
            for (int j = 0 ; j < arr1.length;j++){
                if ((i != j) && (arr1[i] == arr1[j])){
                    if (!isEvenNumberAndEqual(dublicate,arr1[i])){
                        dublicate[dublicateStartIndex++]=arr1[i];

                    }
                }
            }
        }
        for (int value : dublicate){
            if(value != 0){
                System.out.print("["+value+"]");

            }
        }
    }
}