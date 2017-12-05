package PA8;
//60171673 Ȳ����
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
	}//���簢���� �»�� ���� ���ϴ� ���� ����Ѵ�.

	@Override
	public double getArea() {
		double area = width*width;
		return area;
	}//����

	@Override
	public double getLength() {
		double length = width*4;
		return length;
	}//�ѷ��� ����

	@Override
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}//�����̵���Ű��

}
