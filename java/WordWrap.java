
public class WordWrap {

    public static String wordWrap(String input, int columnNumber) {
        int i = 0;
        int count;
        int length = input.length();

        System.out.println("Length of a String is: " + length);
        //System.out.println("test" + input.charAt(4));

        StringBuffer buffer = new StringBuffer(input);

       for (i = 0, count = 0; i < length ; count = 0 , i++) {

           if (i < length - columnNumber){

               if (input.charAt(i + columnNumber ) == ' ') {

                   buffer.setCharAt(i + columnNumber , '\n');
                    input = buffer.toString();
                    i = i + columnNumber;

                } else {

                    while (input.charAt(i + columnNumber - count) != ' '){
                        count++;
                    }

                    buffer.setCharAt(i + columnNumber - count, '\n');
                    input = buffer.toString();
                    i = i + columnNumber - count;

                }
           }
       }

        return input;
    }
}
