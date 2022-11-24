public class VisitorSalar implements Visitor {
    @Override
    public void visit(Element elem) {
        elem.visitElement();
    }
}