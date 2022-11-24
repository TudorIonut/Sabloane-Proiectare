public abstract class Angajat implements Element {
    private final String numeAngajat;
    private double salarAngajat;

    public Angajat(String numeAngajat, double salarAngajat) {
        this.numeAngajat = numeAngajat;
        this.salarAngajat = salarAngajat;
    }

    public String getNumeAngajat() {
        return numeAngajat;
    }

    public double getSalarAngajat() {
        return salarAngajat;
    }

    public void setSalarAngajat(double salarAngajat) {
        this.salarAngajat = salarAngajat;
    }

    @Override
    public abstract void addElement(Element... elems);

    @Override
    public abstract void accept(Visitor obiectVisitor);
}