package PA8;
//60171673 Ȳ����
public class Circle extends Shape{
	double x, y, radius;
	
	@Override
	public void draw() {
		System.out.println("Circle center (" + x + "," + y + ")-radius(" + y + ")");
	}//���� �߽ɰ� ������ ���
	
	public Circle(double x, double y, double radious) {
		super(x,y);
	    this.radius = radious;
	    this.x = x;
	    this.y = y;
	}//���� �߽���ǥ, ������

	 public double getArea() {
	    double area = (3.14)*(radius*radius);
	    return area;
	 }//���� ����
	 public double getLength() {
	    double length = (3.14)*(2*radius);
	    return length;
	 }//���� �ѷ�

	@Override
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}//dx, dy��ŭ �̵���Ű��

}
