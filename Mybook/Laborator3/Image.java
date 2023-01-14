package Laborator3;

public class Image implements Element {

	String url;

	public Image(String url) {
		super();
		this.url = url;
	}

	@Override
	public void print() {
		System.out.println("Image with name: " + this.url);

	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Element get(int i) {
		return null;
		// TODO Auto-generated method stub

	}

}
