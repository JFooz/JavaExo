package fr.dessin;

public class Point2D {

	private int x;
	private int y;

	public Point2D() {
		this(0,0);
	}

	public Point2D(int vX, int vY) {
		this.x = vX;
		this.y = vY;
	}

	public void setX(int valX) {
		this.x = valX;
	}

	public void setY(int valY) {
		this.y = valY;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void afficher() {
		System.out.println("[" + this.x + "," + this.y + "]");
	}

	public void translater(int dX, int dY) {
		this.x = this.x+dX;
		this.y = this.y+dY;
	}
}
