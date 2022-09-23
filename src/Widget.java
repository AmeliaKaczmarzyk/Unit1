/**
 * class widget represents a simple thing for testing
 */
public class Widget {
    private String name;
    private int ID;
    private double cost;
    /**
     * create a thing called widget and what params it has
     * @param n A string for the name
     * @param i An int for the ID
     * @param c A double for the cost
     */
    public Widget(String n, int i, double c){
        name = n;
        ID = i;
        cost = c;
    }
    /**
     * @param args nothing
     */
    public static void main(String[] args) {
        Widget w = new Widget("waffle", 123, 0.75); //new object of Widget type with these params
        Widget myBad = null; //new object of the Widget type with null addr
        System.out.println(w);
        System.out.println(myBad);
    }
}
