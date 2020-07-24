package task;

public class Main {

	public static void main(String[] args) {
		
		int x = -1, y = -1;
		
		Point oPoint = new Point(x, y);
		UserInput oUserInput = new UserInput(oPoint);
		oUserInput.gridSize();
		x = oPoint.getX();
		y = oPoint.getY();
		
		String[][] arrayGrid = new String[y][x];
		oUserInput.initializeGrid(arrayGrid);

		String tempArrayGrid[][] = new String[y][x];
		for (int i = 0; i < arrayGrid.length; i++) {
			for (int j = 0; j < arrayGrid[i].length; j++) {
				tempArrayGrid[i][j] = arrayGrid[i][j];
			}
		}

		int x1 = -1, y1 = -1, N = 0;
		Point oDesiredCell = new Point(x1, y1);
		UserInput oLastUserInput = new UserInput(oDesiredCell);
		
		N = oLastUserInput.desiredGridCell(N);
		x1 = oDesiredCell.getX();
		y1 = oDesiredCell.getY();
		
		Result oResult = new Result();
		oResult.findResult(y, x1, y1, N, arrayGrid, tempArrayGrid);
		oResult.printResult();
	}
}
