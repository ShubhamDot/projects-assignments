public class NumberToBinary {
    public static void main(String[] args) {
        binary(7);
        System.out.println();
        binary(42);
        System.out.println();
        binary(69);
    }

    private static void binary(int a){
        if(a>1){
            binary(a/2);
        }
        System.out.print(a%2);
    }
}
