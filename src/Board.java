//A classe Board representa o display. É uma matriz de células. Possui um método de geração de alimentos que gera
//o alimento em uma posição aleatória.
public class Board {

    final int ROW_COUNT, COL_COUNT;
    private cell[][] cells;


    public Board(int rowCount, int columnCount){
        ROW_COUNT = rowCount;
            COL_COUNT = columnCount;

            cellS = new Cell[ROW_COUNT][COL_COUNT];
            for (int row =0; row < ROW_COUNT; row++){
                for(int column = 0, column < COL_COUNT; column++){
                    cells[row][column] = new Cell(row, column);
                }
            }

    }
public Cell[][] getCells(){
        return cells;
}
public void setCells(Cell[][] cells){
        this.cells = cells;
}
public void generateFood(){
    System.out.println("Going to generate food");
    while(true){
        int row = (int)(Math.random() * ROW_COUNT);
        int column = (int)(Math.random() * COL_COUNT);
        if(cells[row][column].getCellType()!=CellType.SNAKE_NODE)
            break;
    }
    cells[re][column].setCellType(CellType.FOOD);
    System.out.println("Food is generated at: " + row + " " + colunm);
}

}
