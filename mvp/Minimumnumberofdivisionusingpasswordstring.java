package mvp;

public class Minimumnumberofdivisionusingpasswordstring {

    public static void main(String[] args) {
        String str = "PLEASESAVEME";

        int Length = str.length() / 4;
        for (int i = 0; i < 4; i++) {
            StringBuilder segment = new StringBuilder();

            for (int j = 0; j < Length; j++) {
              
                segment.append(str.charAt(i + j * 4));
            }

     
            System.out.println("'" + segment.toString() + "'");
        }
    }
}
/*
StringBuilder segment = new StringBuilder();
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb);  // Output: Hello World

sb.insert(5, " Java");
System.out.println(sb);  // Output: Hello Java World

sb.replace(6, 10, "Awesome");
System.out.println(sb);  // Output: Hello Awesome World

sb.delete(5, 12);
System.out.println(sb);  // Output: Hello World

sb.reverse();
System.out.println(sb);  // Output: dlroW olleH

*/

