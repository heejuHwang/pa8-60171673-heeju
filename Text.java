package PA8;
//60171673 Ȳ����
public class Text implements Drawable {
	String string;
	@Override
	public void draw() {
		System.out.println(string);
	}//string ���
	
	public Text(String string) {
		this.string = string;
	}
}//string ����, ���
