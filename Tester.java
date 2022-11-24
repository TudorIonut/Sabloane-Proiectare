import java.util.ArrayList;
import java.util.List;

public class Tester extends Angajat {
    private final List<Element> elems;

    public Tester(String nume, double salar) {
        super(nume, salar);
        elems = new ArrayList<>();
    }

    @Override
    public void addElement(Element... elems) {
        this.elems.addAll(List.of(elems));
    }

    @Override
    public void visitElement() {
        System.out.printf("Salarul testerului \"" + getNumeAngajat() + " este de %.2f\n", getSalar());
    }

    @Override
    public double getSalar() {
        return getSalarAngajat();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}