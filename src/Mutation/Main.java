package Mutation;

public class Main {
    public static void main(String[] args) {
        String name = "Jon";
        String person = "Jon";
        String twin = "Jon";

        //Comparing Object References. This returns true as all the string objects are 'pointing' or referring
        // the same object in the heap
        System.out.println("First Test Result : " + (name==person && person ==twin));

        //This returns false because the 'new' keyword explicitly creates a new object. Additional Memory is Utilized
        String anotherTwin = new String("Jon");
        System.out.println("second Test :" + (anotherTwin == person));

        // Comparision with the .equals method as a baseline . Returns true
        System.out.println("Third Test :" + (anotherTwin.equals(person)));

    }
}
