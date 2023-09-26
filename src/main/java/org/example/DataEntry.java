package org.example;

import lombok.*;

import java.util.Scanner;
@AllArgsConstructor
@Getter  @ToString  @Setter
public class DataEntry {
    double realPart;
    double imaginaryPart;

    DataEntry () {
        Scanner input = new Scanner(System.in);
        double realPart = input.nextDouble();
        double imaginaryPart = input.nextDouble();
        complex(realPart, imaginaryPart);
    }

    private DataEntry complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
        return null;
    }

    public DataEntry enterData(){
        System.out.println("введите действительную часть и мнимую часть первого числа:  ");
        return complex(realPart, imaginaryPart);
    }
}
