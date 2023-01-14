package Laborator5;


public class AlignCenter implements AlignStrategy {

	@Override
	public String render(String text) {
		return "###" + text + "###";

	}

}
