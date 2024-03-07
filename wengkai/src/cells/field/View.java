package cells.field;

import cells.cell.Cell;

import javax.swing.*;
import java.awt.*;

public class View extends JPanel {
    private static final long serialVersionUID = -52589956712660595L;
    private static final int GRID_SIZE = 16;
    private Field theField;

    public View(Field field) {
        theField = field;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < theField.getHeight(); row++) {
            for (int col = 0; col < theField.getWidth(); col++) {
                Cell cell = theField.get(row, col);
                if (cell != null) {
                    cell.draw(g, col * GRID_SIZE, row * GRID_SIZE, GRID_SIZE);
                }
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(theField.getWidth() * GRID_SIZE + 1, theField.getHeight() * GRID_SIZE + 1);
    }
}
