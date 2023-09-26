package org.example;

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Scanner;

@NoArgsConstructor
@ToString
public class ComplexView extends Complex {

    ConsoleLoger consoleLoger = new ConsoleLoger();
    public Complex run (){

            System.out.println("Введите действительные и мнимые части первого комплексного числа:  ");

            Complex data1 = new Complex();
            data1.complexNumber();
            while (true) {
                String cmd = prompt("введите команду (+, - , * , / ) :  ");
                if (cmd.equals("+")) {
                    System.out.println("Введите действительные и мнимые части второго комплексного числа:  ");
                    Complex data2 = new Complex();
                    data2.complexNumber();
                    Complex result = data1.add(data2);
                    consoleLoger.log( data1.real+ "+"+ data1.image+"i " + cmd+ data2.real+ " + " + data2.image+ "i"+ " = "+ result.real+" + "+ result.image+"i");
                    return result;
                }
                if (cmd.equals("-")){
                    System.out.println("Введите действительные и мнимые части второго комплексного числа:  ");
                    Complex data2 = new Complex();
                    data2.complexNumber();
                    Complex result = data1.sub(data2);
                    consoleLoger.log( data1.real+ "+"+ data1.image+"i " + cmd+ data2.real+ " + " + data2.image+ "i"+ " = "+ result.real+" + "+ result.image+"i");
                    return result;
                }
                if (cmd.equals("*")) {
                    System.out.println("Введите действительные и мнимые части второго комплексного числа:  ");
                    Complex data2 = new Complex();
                    data2.complexNumber();
                    Complex result = data1.mul(data2);
                    consoleLoger.log(data1.real+ "+"+ data1.image+"i " + cmd+ data2.real+ " + " + data2.image+ "i"+ " = "+ result.real+" + "+ result.image+"i");
                    return result;
                }
                if (cmd.equals("/")) {
                    System.out.println("Ведите действительные и мнимые части второго комплексного числа:  ");
                    Complex data2 = new Complex();
                    data2.complexNumber();
                    Complex result = data1.div(data2);
                    consoleLoger.log(data1.real+ "+"+ data1.image+"i " + cmd+ data2.real+ " + " + data2.image+ "i"+ " = "+ result.real+" + "+ result.image+"i");
                    return result;
                }
            }
        }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
