package PA8;
//60171673 황희주
public class Rectangle extends Shape {
	double x,y,h,i;
	
	@Override
	public void draw() {
		System.out.println("Rectangle (" + x + "," + y + ")-(" + (x+h) + "," + (y+i) + ")");
	}//직사각형에서 마주보는 두 점의 좌표 출력
	
	public Rectangle(double x, double y, double h, double i) {
		super(x,y);
	    this.h = h;
	    this.i = i;
	    this.x = x;
	    this.y = y;
	}//직사각형의 한 점의 좌표, 가로/세로 길이

	public double getArea() {
	    double area = h*i;
	    return area;
	 }//직사각형 넓이
	 public double getLength() {
	    double length = 2*(h+i);
	    return length;
	 }//직사각형 둘레

	@Override
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}//dx, dy만큼 이동시키기
}
