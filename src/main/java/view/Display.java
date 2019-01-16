package view;

import javax.swing.*;

public class Display extends JFrame {

    private static final int MIN_CELL_COUNT = 100;
    private static final int MAX_CELL_COUNT = 300;
    private static final int CELL_SIZE = 3;

    private int cellCount;

    public Display(int cellCount) {
        super("Game of Life");
        this.cellCount = cellCount;
        this.addWindowListener(new WindowListener());
    }

    public void showGame() {

        if (cellCount > MAX_CELL_COUNT) {
            cellCount = MAX_CELL_COUNT;
        } else if (cellCount < MIN_CELL_COUNT) {
            cellCount = MIN_CELL_COUNT;
        }

        this.setBounds(200, 200, 400 + (cellCount * CELL_SIZE), 200 + (cellCount * CELL_SIZE));
        this.setVisible(true);
    }

    private void drawGame(State state) {
        // todo draw
    }

    public State render(State previousState) {
        return previousState;
    }

}
