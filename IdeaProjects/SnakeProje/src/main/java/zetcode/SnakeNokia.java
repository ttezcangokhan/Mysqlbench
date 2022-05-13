package zetcode;

public class SnakeNokia {

    private final int row, col;
    private CellType cellType;

    public Cell(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public SnakeNokia(int row) {
        this.row = row;
    }

    public CellType getCellType()
    {
        return cellType;
    }

    public void setCellType(CellType cellType)
    {
        this.cellType = cellType;
    }

    public int getRow()
    {
        return row;
    }

    public int getCol()
    {
        return col;
    }
}

