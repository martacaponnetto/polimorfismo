class Triangolo extends Forma {
    private double base;
    private double altezza;

    // Costruttore
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    public double calcolaArea() {
        double area = (base * altezza) / 2;
        System.out.println("Area del triangolo: " + area);
        return area;
    }
}