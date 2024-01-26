public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(4.0, 8.0);
        System.out.println(rettangolo.calcolaArea());
        Triangolo triangolo = new Triangolo(5.0, 7.0);
        System.out.println(triangolo.calcolaArea());
    }
}