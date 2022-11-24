import java.util.ArrayList;
import java.util.List;

public class Departament implements Element {
    private final String nume;
    private final List<Element> elems;

    public Departament(String nume) {
        this.nume = nume;
        this.elems = new ArrayList<>();
    }

    @Override
    public void addElement(Element... elems) {
        this.elems.addAll(List.of(elems));
    }

    @Override
    public void visitElement() {
        System.out.printf("Salarul total in departamentul \"" + nume + "\" este de " + "%.2f\n", getSalar());
    }

    @Override
    public double getSalar() {
        double salarFirma = 0.0;
        for (Element elem : elems) {
            salarFirma += elem.getSalar();
        }
        return salarFirma;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element elem : elems) {
            elem.accept(visitor);
        }
    }
}