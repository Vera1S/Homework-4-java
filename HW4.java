public class HW4 {
    public static void main(String[] args) {

        char t = 9;

        System.out.println(t);

        System.out.println( (int) t);
        System.out.println( (char) t);

        char w = '9';
        int wInt = Integer.parseInt(String.valueOf(w));

        System.out.println(wInt);

        System.out.println(wInt + 1);

        char e = '9';

        int eInt = Character.getNumericValue(e);
        System.out.println(eInt);

        System.out.println(eInt + 1);
        












    }
}
