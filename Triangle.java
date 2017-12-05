package PA8;
//60171673 황희주
public class Triangle extends Shape{
	double bottom, width, x, y;
	public Triangle(double x, double y, double bottom, double width) {
		super(x, y);
		this.bottom = bottom;
		this.width = width;
		this.x = x;
		this.y = y;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("Triangle (" + (x-bottom/2) + "," + (y-width) + ")-(" + (x+bottom/2) + "," + (y-width) + ")-(" + x + "," + y + ")");
	}//삼각형의 세 꼭지점의 좌표 출력

	@Override
	public double getArea() {
		double area = bottom*width/2;
		return area;
	}//넓이

	@Override
	public double getLength() {
		double length = bottom + (width/Math.sqrt(3))*4;
		return length;
	}//둘레의 길이

	@Override
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}//평행이동시키기

}
