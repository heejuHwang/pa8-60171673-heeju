package PA8;
//60171673 Ȳ����
abstract public class Shape implements Drawable, Movable {
	double x,y;
	public Shape(double x, double y) {
		this.x = x;
	    this.y = y;
	} 

	public abstract double getArea();
	public abstract double getLength();
	
	public void moveCircle() {
	Circle circle = new Circle(100,100,20);
		for(int i = 0; i<10; i++) {
			circle.move(10,10);
			circle.draw();
		}//������ Requirement : Circle������ �� �̵���Ű�� draw�ϱ�
	}
}
