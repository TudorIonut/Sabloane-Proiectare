public class Main {
    public static void main(String[] args) {
        Element firma = new Firma("Firma 1");
        Departament dept = new Departament("Departament 1");
        Manager manager = new Manager("Manager 1", 8000.0);
        Programator programator = new Programator("Programator 1", 4450.0);
        Tester tester = new Tester("Tester 1", 4000.0);
        manager.addElement(programator, tester);
        dept.addElement(manager);
        firma.addElement(dept);
        Subdepartament subdept = new Subdepartament("Subdepartament 1");
        subdept.addElement(new Manager("Manager 2", 7780.0));
        dept.addElement(subdept);
        Visitor visitor = new VisitorSalar();
        firma.accept(visitor);
    }
}