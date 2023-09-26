package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Scanner;

@AllArgsConstructor
@Getter  @ToString
@NoArgsConstructor

public class Complex implements ICalculable {
    double real; // реальная часть
    double image; // мнимая часть

    public void complexNumber() {
        Scanner input = new Scanner(System.in);
        this.real = input.nextDouble();
        this.image = input.nextDouble();
   }


   public Complex add(Complex a) {// Складываем комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real + real2;
        double newImage = image + image2;
        return new Complex(newReal, newImage);
    }

     public Complex sub(Complex a) {// Вычитаем комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real - real2;
        double newImage = image - image2;
        return new Complex(newReal, newImage);
    }

   public Complex mul(Complex a) {// умножить комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = real * real2 - image * image2;
        double newImage = image * real2 + real * image2;
        return new Complex(newReal, newImage);
    }

   public Complex div(Complex a) {// Делим комплексные числа
        double real2 = a.getReal();
        double image2 = a.getImage();
        double newReal = (real * real2 + image * image2) / (real2 * real2 + image2 * image2);
        double newImage = (image * real2 - real * image2) / (real2 * real2 + image2 * image2);
        return new Complex(newReal, newImage);
    }
}
