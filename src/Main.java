import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    record GroceryItem(String name, String type, int count){

        public GroceryItem(String name){
            this(name,"DAIRY",1);
        }

    }

    public static void main(String[] args) {
        System.out.println("Array List!");


        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
        //groceryArray[2] = "5 oranges";
        groceryArray[2] = new GroceryItem("orages","PRODUCE",5);
//        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yougurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges","PRODUCE",5));
        groceryList.set(0,
            new GroceryItem("apples","PRODUCE",6));
        System.out.println(groceryList);
    }
}
