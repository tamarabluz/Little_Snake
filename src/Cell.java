
//A classe Cell representa o único ponto de exibição/placa.
// Ele contém a linha não, coluna não e as informações sobre ele,
// ou seja, está vazio ou há comida nele ou é parte do corpo da cobra?
public class Cell {
    private final int row, col;
    private Celltype celltype;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Celltype getCelltype() {
        return celltype;
    }

    public void setCelltype(Celltype celltype) {
        this.celltype = celltype;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
