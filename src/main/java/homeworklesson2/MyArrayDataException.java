package homeworklesson2;

import java.io.IOException;

public class MyArrayDataException extends IOException {
    public MyArrayDataException(int row, int column) {
        super(String.format("Некорректные данные в ячейке с индексом [%d][%d]", row,column));
    }
}
