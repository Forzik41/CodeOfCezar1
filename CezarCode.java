import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class CezarCode {
    static Scanner scanner = new Scanner(System.in);

    private static char[] alphabet = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};
    private static int shift = 3;


    public void setAlphabet(char[] alphabet) {
        CezarCode.alphabet = alphabet;
    }

    public void setShift(int shift) {
        CezarCode.shift = shift;
    }

    public static String encode(String text) {
        String codeText = "";
        ArrayList<Character> arrayList = new ArrayList();

        int length;
        for(length = 0; length < alphabet.length; ++length) {
            arrayList.add(alphabet[length]);
        }

        if (shift > 30) {
            shift %= 30;
        }

        length = text.length();

        for(int i = 0; i < length; ++i) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch) && arrayList.contains(ch)) {
                char c = (char)(ch + shift);
                if (c > 'я') {
                    codeText = codeText + (char)(ch - (30 - shift));
                } else {
                    codeText = codeText + c;
                }
            } else {
                codeText = codeText + ch;
            }
        }

        return codeText;
    }





    public static void main(String[] args) {
        System.out.println("Укажите путь к файлу");
        String str = scanner.nextLine();
        System.out.println(encode(str));
  // }
  //     try

  // {
  //     BufferedReader TextOtUser = new BufferedReader(new FileReader(scanner.nextLine()));
  //     String str;
  //    while ((str = TextOtUser.readLine()) != null) ;
  //         {
  //             if (!str.isEmpty()) {
  //                 encode.add(str);
  //                 System.out.println("Ваш текст:" + '\n' + str);
  //             }
  //         }
  //         } catch (Exception e) {
  //         System.out.println("Ерор, файл не найден");
  //         System.exit(0);
  //         }
  //         System.out.println("Укажите сдвиг, он же ключ.");
  //         shift = scanner.nextInt();
  //         int result = key + index;
  // }
  //         private boolean IsExit(Character a){
  //         for (char s:alphabet) {
  //         if (a.equals(s)){
  //             symExit = true;
  //             return true;
  //         }
  //         }
  //         symExit = false;
  //         return false;
  // }
}
}