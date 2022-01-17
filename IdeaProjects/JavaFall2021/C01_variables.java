package day17_forLoops;

public class C07_NestedForLoop {

    public static void main(String[] args) {
        for(int i=1; i<=4 ; i++) {
            for(int j=1; j<=i ;i++) {
                System.out.println( "*");
            }
            System.out.println(" ");
        }

    }

}
