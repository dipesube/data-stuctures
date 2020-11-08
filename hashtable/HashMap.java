import java.util.Arrays;

public class HashMap{
    String[] a;
    int arraySize;
    int itemInArray = 0;

    public static void main(String[] args){ //testing values
        HashMap map = new HashMap(30);
        String[] elementsToAdd = {"1", "2", "5", "10"};
        map.hashFunction1(elementsToAdd, map.a); 
        
    }

    public void hashFunction1(String[] stringsForArray, String arr[]){
        for (int i = 0; i < stringsForArray.length; i++){
            String newElement = stringsForArray[i];
            arr[Integer.parseInt(newElement)] = newElement;
        }
    }

    public HashMap(int size){
        this.arraySize = size;
        this.a = new String[size];
        Array.fill(this.a, "-1");
    }

}