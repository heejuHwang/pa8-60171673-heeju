package PA8;
//60171673 황희주
public class ShapeTest2 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10,20,30,40);
		shapes[1] = new Rectangle(30,30,10,10);
		shapes[2] = new Circle(50,20,30);
		
		for(Shape s: shapes) {
			System.out.printf("Area: %s \n", s.getArea());			
			System.out.printf("Length: %s \n", s.getLength());
		}//설정한 직사각형, 원의 정보 출력 
		
		Drawable[] drawables = new Drawable[5];
		for(int i = 0; i< shapes.length; i++) {
			drawables[i] = shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		drawables[4] = new Bear(100, 100, 20);
		//drawables에 각 도형 넣기
		for(Drawable d: drawables) {
			d.draw();
		}//drawables의 원소의 draw 실행
	}

}
