package game2048;

public class BoardPrinter {

    /* This function prints current board state on screen */
    public void printBoard(int[][] boardData) {
        for (int i = 0; i < boardData.length; i++) {
            for (int j = 0; j < boardData.length; j++) {
                int processingNumber = boardData[i][j];
                System.out.print("[");

                /* Prints number with left-right paddings depending on number value */
                if(processingNumber < 10) {
                    System.out.print("  " + processingNumber + " ");
                } else if (processingNumber < 100) {
                    System.out.print(" " + processingNumber + " ");
                } else if (processingNumber < 1000) {
                    System.out.print(" " + processingNumber);
                } else {
                    System.out.print(processingNumber);
                }

                System.out.print("]");
            }
            System.out.println("");
        }
    }

    /* Only for testing purposes, comment / remove after merge to complete version */
    public static void main(String[] args) {

        /* Just an example of game current state, feel free to change it */
        int[][] boardData = {
                {8, 4, 0 ,4},
                {2, 16, 0, 0},
                {0, 0, 0, 128},
                {0, 1024, 512, 0}
        };

        /* Same code will be written in calling class (NOT this) */
        BoardPrinter boardPrinter = new BoardPrinter();
        boardPrinter.printBoard(boardData);

    }


}
