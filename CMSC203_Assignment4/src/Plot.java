
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: Create a Plot class
 * Due: 7/17/2022
 * Platform/compiler: Eclipse and Command Prompt
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Manny Fomundam
*/

public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;

	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public boolean overlaps(Plot plot) {
		if(plot.getX() < getX() && plot.getY() < getY()) {
			if(plot.getX() + plot.getY() + plot.getWidth() + plot.getDepth() > getX() && plot.getX() + plot.getY() + plot.getWidth() + plot.getDepth() > getY()) {
				return false;
			}
		}
		if(plot.getX() > getX() && plot.getY() < getY() && plot.getX() < getX() + getWidth()) {
			if(plot.getY()+plot.getDepth() > getY()) {
				return false;
			}
		}
		if(plot.getX() < getX() && plot.getY() > getY() && plot.getY() < getY() + getDepth()) {
			if(plot.getX() + plot.getWidth() > getX()) {
				return false;
			}
		}
		if (plot.getX() >= getX() && plot.getY() >= getY() && plot.getX() < getX() + getWidth() && plot.getY() < getY() + getDepth()) {
			return false;
		}
		return true;
	}
	
	public boolean encompasses(Plot plot) {
		if(plot.getWidth() > 10 || plot.getDepth() >10 || plot.getX() > 10 || plot.getY() > 10)
			return false;
		if(plot.getX() + plot.getWidth() > 10 || plot.getY() + plot.getDepth() > 10)
			return false;
		return true;
	}
	
	public int getX () {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY () {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getWidth () {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public String toString() {
		String str = "Upper left: (" + getX() + "," + getY() + "); Width: "  + getWidth() + " Depth: " + getDepth();
		return str;
	}
}