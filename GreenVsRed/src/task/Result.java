package task;

public class Result {

	// members
	private int iGreenCellCount;
	private boolean bFlag;

	// constructors
	public Result() {
		iGreenCellCount = 0;
		bFlag = false;
	}

	// finds the number of times the cell was green from Generation Zero to
	// Generation N
	void findResult(int y, int x1, int y1, int N, String[][] arrayGrid, String[][] tempArrayGrid) {

		Validation oValidation = new Validation();

		for (int k = 0; k < N; k++) {
			for (int iHeight = 0; iHeight < arrayGrid.length; iHeight++) {
				for (int iWidth = 0; iWidth < arrayGrid[iHeight].length; iWidth++) {
					if (arrayGrid[iHeight][iWidth].equals("0")) {
						int iGreenCount = oValidation.checkForGreens(arrayGrid, iHeight, iWidth, y);
						if (iGreenCount == 3 || iGreenCount == 6) {
							if (iHeight == y1 && iWidth == x1) {
								iGreenCellCount++;
								bFlag = true;
							}
							tempArrayGrid[iHeight][iWidth] = "1";
						}
					} else {
						int iGreenCount = oValidation.checkForGreens(arrayGrid, iHeight, iWidth, y);
						if (iGreenCount == 0 || iGreenCount == 1 || iGreenCount == 4 || iGreenCount == 5
								|| iGreenCount == 7 || iGreenCount == 8) {
							tempArrayGrid[iHeight][iWidth] = "0";
						}
					}
					if (!bFlag)
						if (iHeight == y1 && iWidth == x1 && tempArrayGrid[iHeight][iWidth].equals("1")) {
							iGreenCellCount++;
						}
				}
			}

			for (int i = 0; i < arrayGrid.length; i++) {
				for (int j = 0; j < arrayGrid[i].length; j++) {
					arrayGrid[i][j] = tempArrayGrid[i][j];
				}
			}

			bFlag = false;
		}
	}

	// prints the number of times the cell was green from Generation Zero to
	// Generation N
	void printResult() {
		System.out.println("Result: " + iGreenCellCount);
	}
}
