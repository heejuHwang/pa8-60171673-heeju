package PA8;
//60171673 Ȳ����
public class Rectangle extends Shape {
	double x,y,h,i;
	
	@Override
	public void draw() {
		System.out.println("Rectangle (" + x + "," + y + ")-(" + (x+h) + "," + (y+i) + ")");
	}//���簢������ ���ֺ��� �� ���� ��ǥ ���
	
	public Rectangle(double x, double y, double h, double i) {
		super(x,y);
	    this.h = h;
	    this.i = i;
	    this.x = x;
	    this.y = y;
	}//���簢���� �� ���� ��ǥ, ����/���� ����

	public double getArea() {
	    double area = h*i;
	    return area;
	 }//���簢�� ����
	 public double getLength() {
	    double length = 2*(h+i);
	    return length;
	 }//���簢�� �ѷ�

	@Override
	public void move(double dx, double dy) {
		x = x + dx;
		y = y + dy;
	}//dx, dy��ŭ �̵���Ű��
}
