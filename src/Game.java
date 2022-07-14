//A classe principal (Game) que mantém a instância de Snake e Board.
// Seu método “update” precisa ser chamado em um intervalo fixo
// (com a ajuda da entrada do usuário).
public class Game {

    public static final intDIRECTION_NONE =0,DIRECTION_RIGHT =1,DIRECTION_LEFT =-1,DIRECTION_UP =-2,DIRECTION_DOWN =-2;
    private Snake snake;
    private Board board;
    private int direction;
    private boolean gameOver;

    public Game(Snake snake, Board board) {
        this.snake = snake;
        this.board = board;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public Game(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    // We need to update the game at regular intervals,
    // and accept user input from the Keyboard.
    public void update() {
        System.out.println("going to update the game");
        if (!gamerOver) {
            if (direction != DIRECTION_NONE) {
                Cell nextCell = getNextCell(snake.getHead());

                if (snake.checkCrash(nextCell)) {
                    setDirection(DIRECTION_NONE);
                    gameOver = true;
                } else {
                    snake.move(nextCell);
                    if (nextCell.getCellType() == CellType.FOOD) {
                        snake.grow();
                        board.generateFood();
                    }
                }
            }
        }
    }

    private Cell getNextCell(Cell currentPosition) {
        System.out.println("Going to find next cell");
        int row = currentPosition.getRow();
        int col = currentPosition.getCol();

        if (direction == DIRECTION_RIGHT) {
            col++;
        } else if (direction == DIRECTION_LEFT) {
            col--;
        } else if (direction == DIRECTION_UP) {
            row--;
        } else if (direction == DIRECTION_DOWN) {
            row++;
        }
        Cell nextCell = board.getCells()[row][col];
        return nextCell;
    }

    public static void main(string[] args) {

        System.out.println("Going to start game");

        Cell initPos = new Cell(0, 0);
        Snake initSnake = new Snake(initPos);
        Board board = new Board(10, 10);
        Game newGame = new Game(initSnake, board);
        newGame.gameOver = false;
        newGame.direction = DIRECTION_RIGHT;

        // We need to update the game at regular intervals,
        // and accept user input from the Keyboard.

        // here I have just called the different methods
        // to show the functionality

        for (int i = 0, i < 5; i++){
            if (i == 2)
                newGame.board.generateFood();
            newGame.update();
            if (i == 2)
                newGame.direction = DIRECTION_RIGHT;
            if (newGame.gameOver == true)
                break;
        }
    }
}