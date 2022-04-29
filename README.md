# **COEFFICIENT SUM**

## INFORMATION

* **Program that generates the sum of even numbers and the sum of multiples of 4.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* A and total variables are defined with int.

* Scanner class is defined to enable the user to enter numbers.

* Allows the user to enter even numbers until a single value is entered using the do - while module

* The remaining module is used for the multiples of 4 of the entered number value and the sum of even numbers.

## CODES

```Java

        import java.util.Scanner;

        public class coefficientsum{

            public static void main(String[] args) {

            int a, total = 0;

            Scanner input = new Scanner(System.in);


```

```Java

                do {

                    System.out.print("Enter a number : ");

                    a = input.nextInt();

                    if(a % 4 == 0){

                        total += a;
                    }
                } while(a % 2 == 0);

                System.out.print("Total : " + total);
            }
        }

```

```bash

        Enter a number : 24
        Enter a number : 16
        Enter a number : 20
        Enter a number : 84
        Enter a number : 37
        Total : 144

```

<br />

## LINK

* Click here https://github.com/Fogo9/CoefficientSum.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
