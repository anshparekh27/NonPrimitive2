public class Main {
    public static void main(String[] args) {
        Point p1=new Point();
        Point p2=p1; // p2 acts as a reference and there will be no memory allocation

        System.out.println(p1.x); // default value 0 is declared in case of non-primitives
        System.out.println(p1.y);
        }
    }
