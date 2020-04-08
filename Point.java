import java.util.*;
import java.io.*;


class Point {
	String id
	double x, y;

	//TODO add new variable
	String color;
	//TODO constructor

	public Point(String id, double x, double y, String color) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	//TODO setters and getters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move(char xDirection, char yDirection) {
		//TODO
		if (xDirection == 'L') {
			x = x - 1;
		} else if (xDirection == 'R') {
			x = x + 1;
		}
		if (yDirection == 'U') {
			y = y + 1;
		} else if (yDirection == 'D') {
			y = y - 1;
		}
	}

	public void draw() {
		//TODO
		System.out.println("(" + getX() + "," + getY() + ")");
	}
}
public abstract interface List extends Collection{
}
class Canvas extends Point{
	List<Point> list = new LinkedList();

	public static void addPoint(List<Point> list)
	{
		Point tockaNova = new Point("tocka",3,5,"red");
		list.add(tockaNova);
	}
	public static void deletePoint(List<Point> list,Point tocka)
	{
		ListNode<Point> dvizi = list.getFirst();
		ListNode<Point> d = null;
		while(dvizi.succ !=null)
		{
			if(dvizi==tocka)
			{
				d = dvizi;
				d.delete();
			}
			dvizi = dvizi.succ;
		}
	}
}
