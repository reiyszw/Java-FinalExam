package Day1;public class Day1 {    public static void main(String[] args){        String name = "Rei";        System.out.println(name); //sout        System.out.println("aaaaaaa");        int age = 25;        if (age >= 18) {            System.out.println("You can drink");        } else if (age >= 18 && age < 18){            System.out.println("You can drink a little bit");        } else {            System.out.println("You can't drink");        }        switch (age){            case 10:                System.out.println("Elementary school");                break;            case 18:                System.out.println("College");                break;            default:                System.out.println("Hello");        }        int n = 10;        for (int i = 0; i < n; i++){            if (i == 7) {                continue;            }            System.out.println(i + ": Hello!");    }        while (n < 20){            System.out.println(n);            n++;        }    }}