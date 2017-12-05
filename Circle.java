package PA8;
//60171673 황희주
public class Circle extends Shape{
	double x, y, radius;
	
	@Override
	public void draw() {
		System.out.println("Circle center (" + x + "," + y + ")-radius(" + y + ")");
	}//원의 중심과 반지름 출력
	
	public Circle(double x, double y, double radious) {
		super(x,y);
	    this.radius = radious;
	    this.x = x;
	    this.y = y;
	}//원의 중심좌표, 반지름

	 public double getArea() {
	    double area = (3.14)*(radius*radius);
	    return area;
	 }//원의 넓이
	 public double getLength() {
	    double length = (3.14)*(2*radius);
	    return length;
	 }//원의 둘레

	@Override
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}//dx, dy만큼 이동시키기

}
