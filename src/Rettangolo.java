class Rettangolo extends Forma {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {         // Costruttore
        this.base = base;
        this.altezza = altezza;
    }
    public double calcolaArea() {
        double area = base * altezza;
        System.out.println("Area del rettangolo: " + area); {

        }
        return area;
    }
}