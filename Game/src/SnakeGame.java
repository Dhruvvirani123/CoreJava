import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class SnakeGame extends JFrame implements KeyListener {
    private static final int ROWS = 20;
    private static final int COLS = 20;
    private static final int CELL_SIZE = 20;
    private static final int DELAY = 200;

    private int[][] grid;
    private int snakeHeadRow;
    private int snakeHeadCol;
    private int snakeLength;
    private int direction;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(COLS * CELL_SIZE, ROWS * CELL_SIZE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(this);

        grid = new int[ROWS][COLS];
        snakeHeadRow = ROWS / 2;
        snakeHeadCol = COLS / 2;
        snakeLength = 1;
        direction = KeyEvent.VK_RIGHT;

        Timer timer = new Timer(DELAY, e -> move());
        timer.start();
    }

    private void move() {
        int newHeadRow = snakeHeadRow;
        int newHeadCol = snakeHeadCol;

        if (direction == KeyEvent.VK_UP)
            newHeadRow--;
        else if (direction == KeyEvent.VK_DOWN)
            newHeadRow++;
        else if (direction == KeyEvent.VK_LEFT)
            newHeadCol--;
        else if (direction == KeyEvent.VK_RIGHT)
            newHeadCol++;

        if (newHeadRow < 0 || newHeadRow >= ROWS || newHeadCol < 0 || newHeadCol >= COLS) {
            gameOver();
            return;
        }

        if (grid[newHeadRow][newHeadCol] == 1) {
            gameOver();
            return;
        }

        if (grid[newHeadRow][newHeadCol] == 2) {
            snakeLength++;
            placeFood();
        }

        grid[snakeHeadRow][snakeHeadCol] = 1;
        snakeHeadRow = newHeadRow;
        snakeHeadCol = newHeadCol;

        if (--snakeLength == 0) {
            int tailRow = -1;
            int tailCol = -1;
            for (int row = 0; row < ROWS; row++) {
                for (int col = 0; col < COLS; col++) {
                    if (grid[row][col] == 1) {
                        grid[row][col] = 0;
                        if (tailRow == -1 && tailCol == -1) {
                            tailRow = row;
                            tailCol = col;
                        }
                    }
                }
            }
            snakeHeadRow = tailRow;
            snakeHeadCol = tailCol;
        }

        grid[snakeHeadRow][snakeHeadCol] = 1;
        repaint();
    }

    private void placeFood() {
        int row;
        int col;

        do {
            row = (int) (Math.random() * ROWS);
            col = (int) (Math.random() * COLS);
        } while (grid[row][col] != 0);

        grid[row][col] = 2;
    }

    private void gameOver() {
        System.out.println("Game Over");
        System.exit(0);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0to < COLS; col++) {
                if (grid[row][col] == 1) {
                    g.setColor(Color.GREEN);
                    g.fillRect(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                } else if (grid[row][col] == 2) {
                    g.setColor(Color.RED);
                    g.fillOval(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if ((key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)
                && Math.abs(key - direction) != 2) {
            direction = key;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SnakeGame game = new SnakeGame();
            game.setVisible(true);
        });
    }
}
