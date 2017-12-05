package PA8;
//60171673 Ȳ����
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
	}//�ﰢ���� �� �������� ��ǥ ���

	@Override
	public double getArea() {
		double area = bottom*width/2;
		return area;
	}//����

	@Override
	public double getLength() {
		double length = bottom + (width/Math.sqrt(3))*4;
		return length;
	}//�ѷ��� ����

	@Override
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}//�����̵���Ű��

}
