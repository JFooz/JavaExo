package fr;

import fr.dessin.Point2D;

public class Run {

	public static void main(String[] args) {
		Point2D point1 = new Point2D(20, 16) ;
		Point2D point2 = new Point2D() ;

		point1.afficher();

		point2.afficher();
		point2.getX();
		point2.setX(10);
		point2.getY();
		point2.setY(15);
		point2.afficher();

		point1.translater(8, 12);
		point2.translater(46, 15);
		point1.afficher();
		point2.afficher();
	}
}
