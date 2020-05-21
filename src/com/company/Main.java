package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Figure figure;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which figure - triangle (1), rectangle (2) or rhombus (3): ");
        int choice = Integer.parseInt(scanner.nextLine());
        String [] inputs;
        switch (choice){
            case 1:
                System.out.println("Input three verges: ");
                inputs = scanner.nextLine().split(" ");
                figure=new Triangle(Integer.parseInt(inputs[0]),Integer.parseInt(inputs[1]),Integer.parseInt(inputs[2]));
                break;
            case 2:
                System.out.println("Input two verges: ");
                inputs = scanner.nextLine().split(" ");
                figure=new Rectangle(Integer.parseInt(inputs[0]),Integer.parseInt(inputs[1]));
                break;
            case 3:
                System.out.println("Input verge and angle: ");
                inputs = scanner.nextLine().split(" ");
                figure=new Rhombus(Integer.parseInt(inputs[0]),Integer.parseInt(inputs[1]));
                break;
            default:
                System.out.println("Wrong input");
                return;
        }

        System.out.println("Perimeter: " + figure.getPerimeter());
        System.out.println("Square: " + figure.getSquare());


    }
}
