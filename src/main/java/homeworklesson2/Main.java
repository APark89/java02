package homeworklesson2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] wrongSizeArr = {
                {"1", "7", "5", "d"},
                {"8", "3", "4", "6"},
                {"7", "0", "2", "1"},
                {"9", "8", "3", "1"},
                {"1", "7", "5", "d"}
        };

        String[][] correctSizeArr = {
                {"1", "7", "5", "d"},
                {"8", "3", "4", "6"},
                {"7", "0", "2", "1"},
                {"9", "8", "3", "1"}
        };

        try {
            checkExceptionArr(wrongSizeArr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
            checkExceptionArr(correctSizeArr);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static int checkExceptionArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int convertion;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException("Передан не правильный размер массива");
                }
                try {
                    convertion = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
/*                  e.printStackTrace();
                    convertion = 0;
                    System.out.println("Ошибка");*/
                }
                sum = sum + convertion;
                System.out.println(sum);
            }
        }
        return sum;
    }
}

