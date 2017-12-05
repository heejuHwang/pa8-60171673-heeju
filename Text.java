package PA8;
//60171673 황희주
public class Text implements Drawable {
	String string;
	@Override
	public void draw() {
		System.out.println(string);
	}//string 출력
	
	public Text(String string) {
		this.string = string;
	}
}//string 설정, 출력
