public interface Element extends Visitable {
    void addElement(Element... elems);
    void visitElement();
    double getSalar();
}