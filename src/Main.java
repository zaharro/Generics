//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        checkInput("sdfdfdfdf44");
        checkInput("deffghh");
        checkInput("457");


        SwapToArrayElements swaper = new SwapToArrayElements();
        String[] words = {"Hello", "Goodbye", "Good morning"};
        Integer[] numbers = {23, 4, 5, 2};

        swaper.swap(words, 0, 1);
        swaper.swap(numbers, 1, 2);


    }

    /*  3 Написать метод, который принимает строку от пользователя, и если в этой строке есть число -
    выбрасывает исключение, выводя пользователю сообщение: “Строка не должна содержать число!”*/
    static void checkInput(String line) {
        try {
            if (line.matches(".*\\d.*")) throw new Exception("Строка не должна содержать число!");
        } catch (Exception ex) {

            System.out.println(line + " - " + ex.getMessage());
        }
    }
}

//1 Написать метод, который меняет 2 элемента массива местами (массив может быть любого ссылочного типа)

class SwapToArrayElements {

    public <T> void swap(T[] items, int i, int j) {
        T t = items[i];
        items[i] = items[j];
        items[j] = t;

        for (T item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

