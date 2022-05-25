package tictactoe;

public class TikTakToe {
    private char[][] state;

    public TikTakToeGame(char[][] initialState) {
        this.state = initialState;
    }

    public String getState() {
        StringBuilder out = new StringBuilder();
        out.append("---------\n");
        for (char[] chars : this.state) {
            StringBuilder row = new StringBuilder();
            row.append("| ");
            for (char aChar : chars) {
                row.append(aChar).append(" ");
            }
            row.append("|");
            out.append(row).append("\n");
        }
        out.append("---------");
        return out.toString();
    }

    public String getStatus() {
        int countOfX = 0;
        int countOfO = 0;
        int emptyCount = 0;
        boolean xWins = false;
        boolean oWins = false;
        for (int i = 0; i < this.state.length; i++) {
            if (i == 0) {
                boolean equalsFirstDiagonal = this.state[i][0] == this.state[1][1] &&
                        this.state[i][0] == this.state[2][2];
                boolean equalsSecondDiagonal = this.state[i][2] == this.state[1][1] &&
                        this.state[2][0] == this.state[i][2];
                if (equalsFirstDiagonal || equalsSecondDiagonal && this.state[i][0] == 'X') {
                    xWins = true;
                } else if (equalsFirstDiagonal || equalsSecondDiagonal && this.state[i][0] == 'O') {
                    oWins = true;
                }
            }

            boolean equalHorizontal = this.state[i][0] == this.state[i][1] && this.state[i][0] == this.state[i][2];

            if (equalHorizontal && this.state[i][0] == 'X') {
                xWins = true;
            } else if (equalHorizontal && this.state[i][0] == 'O') {
                oWins = true;
            }

            for (int j = 0; j < this.state[i].length; j++) {
                String current = String.valueOf(this.state[i][j]);
                if ("X".equals(current)) {
                    countOfX++;
                } else if ("O".equals(current)) {
                    countOfO++;
                } else {
                    emptyCount++;
                }
                if (i == 0) {
                    boolean equalVertical = this.state[i][j] == this.state[1][j] &&
                            this.state[i][j] == this.state[2][j];
                    if (equalVertical && "X".equals(current)) {
                        xWins = true;
                    } else if (equalVertical && "O".equals(current)) {
                        oWins = true;
                    }
                }
            }
        }

        if (oWins && xWins || Math.abs(countOfO - countOfX) >= 2) {
            return Messages.IMPOSSIBLE.message;
        } else if (oWins) {
            return String.format(Messages.WINNER.message, "O");
        } else if (xWins) {
            return String.format(Messages.WINNER.message, "X");
        } else if (emptyCount == 0) {
            return Messages.DRAW.message;
        } else {
            return Messages.NOT_FINISHED.message;
        }
    }
}
