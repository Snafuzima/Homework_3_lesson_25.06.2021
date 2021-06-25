import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String userWord;
        char[] letters = {'*','*','*','*','*','*','*','*','*','*'};

            //Рандомим слово для компа
            Random random = new Random();
            int randomWord = random.nextInt(words.length);
            String compWord = words[randomWord];

            //показ зарандомленного слова
            System.out.println(compWord);

            //Записываем слово юзера
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your word ---> ");
            userWord = sc.nextLine();

            while (true) {
                //Сравниваем два слова
                if (compWord.equals(userWord)) {
                    System.out.println("You won!");
                    break;

                } else {

                    if (userWord.length() > compWord.length()) {
                        System.out.println("Enter new word, because the word is too big -->");
                        userWord = sc.nextLine();
                    } else {
                        //крутим слово сравнивая символы
                        for (int i = 0; i < userWord.length(); i++) {

                            if (compWord.charAt(i) == userWord.charAt(i)) {
                                letters[i] = compWord.charAt(i);

                            }
                        }
                        //выводим массив с символами.
                        System.out.println(Arrays.toString(letters));

                        //просим ввести новое слово
                        System.out.print("Enter new word --> ");
                        userWord = sc.nextLine();
                    }


                }

            }
    }
}
