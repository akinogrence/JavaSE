package com.company;

public class Main {




    public static void main(String[] args) {

    Animals animals = Animals.DOG;

  /*  switch (animals)
    {
        case CAT:
            System.out.println("cat");
            break;
        case DOG:
            System.out.println("dog");
            break;
        case MOUSE:
            System.out.println("mouse");
            break;
    }*/

        System.out.println(Animals.DOG.getName());

        System.out.println(Animals.CAT.getName());


        Animals animal2 = Animals.valueOf("CAT");
        System.out.println(animal2);
        }

    }




