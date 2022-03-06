import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
     // 1. Написать метод, который меняет два элемента массива местами.
    static void swapObj(Object[] array, int firstIndex, int secondIndex) {
        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }

   // 2. Написать метод, который преобразует массив в ArrayList;

    static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
