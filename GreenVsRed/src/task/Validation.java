package task;

public class Validation {

	// constructors
	public Validation() {
	}

	// returns the count of the green neighbors of the cell
	int checkForGreens(String[][] arrayGrid, int i, int j, int y) {
		int iGreenCount = 0;

		int iHeight = arrayGrid[y - 1].length;

		if (i + 1 >= 0 && j >= 0 && i + 1 < arrayGrid.length && j < iHeight)
			if (arrayGrid[i + 1][j].equals("1")) {
				iGreenCount++;
			}

		if (i >= 0 && j + 1 >= 0 && i < arrayGrid.length && j + 1 < iHeight)
			if (arrayGrid[i][j + 1].equals("1")) {
				iGreenCount++;
			}

		if (i + 1 >= 0 && j + 1 >= 0 && i + 1 < arrayGrid.length && j + 1 < iHeight)
			if (arrayGrid[i + 1][j + 1].equals("1")) {
				iGreenCount++;
			}

		if (i - 1 >= 0 && j >= 0 && i - 1 < arrayGrid.length && j < iHeight)
			if (arrayGrid[i - 1][j].equals("1")) {
				iGreenCount++;
			}

		if (i >= 0 && j - 1 >= 0 && i < arrayGrid.length && j - 1 < iHeight)
			if (arrayGrid[i][j - 1].equals("1")) {
				iGreenCount++;
			}

		if (i - 1 >= 0 && j - 1 >= 0 && i - 1 < arrayGrid.length && j - 1 < iHeight)
			if (arrayGrid[i - 1][j - 1].equals("1")) {
				iGreenCount++;
			}

		if (i + 1 >= 0 && j - 1 >= 0 && i + 1 < arrayGrid.length && j - 1 < iHeight)
			if (arrayGrid[i + 1][j - 1].equals("1")) {
				iGreenCount++;
			}

		if (i - 1 >= 0 && j + 1 >= 0 && i - 1 < arrayGrid.length && j + 1 < iHeight)
			if (arrayGrid[i - 1][j + 1].equals("1")) {
				iGreenCount++;
			}

		return iGreenCount;
	}
}
