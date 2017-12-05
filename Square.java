package PA8;
//60171673 황희주
public class Square extends Shape {
	double width, x, y;
	public Square(double x, double y, double width) {
		super(x, y);
		this.width = width;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("Square (" + x + "," + (y-width) + ")-(" + (x+width) + "," + y + ")");
	}//정사각형의 좌상단 점과 우하단 점을 출력한다.

	@Override
	public double getArea() {
		double area = width*width;
		return area;
	}//넓이

	@Override
	public double getLength() {
		double length = width*4;
		return length;
	}//둘레의 길이

	@Override
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}//평행이동시키기

}
