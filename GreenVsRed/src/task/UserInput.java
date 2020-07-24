package task;

import java.util.Scanner;

public class UserInput {
	
	//members
	private Point mPoint;

	
	//setters and getters
	public Point getmPoint() {
		return mPoint;
	}

	public void setmPoint(Point mPoint) {
		this.mPoint = mPoint;
	}

	//constructors
	public UserInput() {
	}

	public UserInput(Point mPoint) {
		super();
		this.mPoint = mPoint;
	}
	
	//sets the width and the height of the grid
	void gridSize() {
		int iSeparator, x = mPoint.getX(), y = mPoint.getY();
		do {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the size of the grid");
			String c = scanner.next();
			iSeparator = c.indexOf(",");
			String subString;
			if (iSeparator != -1) {
				subString = c.substring(0, iSeparator);
				x = Integer.parseInt(subString);
			}
			while (!scanner.hasNextInt()) {
				System.out.println("Enter integer ");
				scanner.next();
			}
			y = scanner.nextInt();

		} while (x > y || y > 1000 || iSeparator == -1 || y < 0 || x < 0);
		mPoint.setX(x);
		mPoint.setY(y);
	}

	//sets the values of the grid
	//returns the initialized array
	String[][] initializeGrid(String[][] arrayGrid) {
		System.out.println("Initialize the grid");
		int x = mPoint.getX(), y = mPoint.getY();
		for (int i = 0; i < y; i++) {
			Scanner scanner = new Scanner(System.in);
			String strLine = scanner.nextLine();
			while (strLine.length() != x || !(strLine.matches("[01]+"))) {
				System.out.println("Enter " + x + " 0s or 1s");
				strLine = scanner.nextLine();
			}
			for (int j = 0; j < x; j++) {
				arrayGrid[i][j] = strLine.substring(j, j + 1);
			}
		}
		return arrayGrid;
	}

	//coordinates of a desired cell and the N generations when the cell was green
	//return the N value
	int desiredGridCell(int N) {
		int x1 = mPoint.getX(), y1 = mPoint.getY(), iX1Separator, iY1Separator;
		do {
			System.out.println("Enter x1, y1, N");
			Scanner scanner = new Scanner(System.in);

			String strX1 = scanner.next();
			iX1Separator = strX1.indexOf(",");
			if (iX1Separator != -1) {
				String subStringX1 = strX1.substring(0, iX1Separator);
				x1 = Integer.parseInt(subStringX1);
			}

			String strY1 = scanner.next();

			iY1Separator = strX1.indexOf(",");
			if (iY1Separator != -1) {
				String subStringY1 = strY1.substring(0, iY1Separator);
				y1 = Integer.parseInt(subStringY1);
			}

			while (!scanner.hasNextInt()) {
				System.out.println("Enter integer ");
				scanner.next();
			}
			N = scanner.nextInt();

		} while (y1 < 0 || x1 < 0 || iX1Separator == -1 || iY1Separator == -1 || N < 0);
		mPoint.setX(x1);
		mPoint.setY(y1);
		return N;
	}
}
