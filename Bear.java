package PA8;
//60171673 È²ÈñÁÖ
public class Bear implements Drawable {
	double x, y, radius;
	public Bear(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Bear");
		System.out.println("Rectangle (" + (x-radius) + "," + (y-radius) + ")-(" + (x+radius) + "," + (y+radius) + ")");
		System.out.println("Circle center (" + (x-radius) + "," + (y+radius)+ ")-radius(" + radius + ")");
		System.out.println("Circle center (" + (x+radius) + "," + (y+radius)+ ")-radius(" + radius + ")");
	}//Bear Ãâ·Â

}
