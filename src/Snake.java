//A classe Snake, que contém o corpo e a cabeça.
//Usamos Linked List para armazenar o corpo porque podemos adicionar uma célula em O(1).
//O método Grow será chamado quando ele comer o alimento. Outros métodos são autoexplicativos.


import java.util.LinkedList;

public class Snake {
    private LinkedList<Cell>
    snakePartList = new java.util.LinkedList<>();
    private Cell head;
    public Snake(Cell initPos){
        head = initPos;
        snakePartList.add(head);
        head.setCelltype(CellType.SNAKE_NODE);
    }

    public void grow(){ snakePartList.add(head);}

    public void move(Cell nextCell) {
        System.out.println("Snake is moving to "
                + nextCell.getRow() + " "
                + nextCell.getCol());
        Cell tail = snakePartList().removeLast();
        tail.setCelltype(Celltype.Empty);

        head = nextCell;
        head.setCelltype(CellType.SNAKE_NODE);
        snakePartList.add.First(head);
    }
    public boolean checkCrash(Cell nextCell){
        System.out.println("going to check for Crash");
        for (Cell cell : snakePartList){
            if (cell == nextCell){
                return true;
            }
        }
        return false;
    }
    public LinkedList<Cell> getSnakePartList(){
        return SnakePartList;
    }

    public void setSnakePartList(LinkedList<Cell> snakePartList){
        this.getSnakePartList = snakePartList;
    }
    public Cell getHead(){
        return head;}

    public void setHead(Cell head) {
        this.head = head;
    }
}
