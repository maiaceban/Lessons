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
}
