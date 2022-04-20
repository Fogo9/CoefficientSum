# **COEFFICIENT SUM**

# Information

* **Program that generates the sum of even numbers and the sum of multiples of 4.**

# Technologies Used

* **JAVA**

# Contents

* A and total variables are defined with int.

* Scanner class is defined to enable the user to enter numbers.

* Allows the user to enter even numbers until a single value is entered using the do - while module

* The remaining module is used for the multiples of 4 of the entered number value and the sum of even numbers.

<br />

# Codes

```Java

        import java.util.Scanner;

        public class coefficientsum{

            public static void main(String[] args) {

            int a, total = 0;

            Scanner input = new Scanner(System.in);


```

```Java

                do {

                    System.out.print("Bir sayı gir : ");

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

        Bir sayı gir : 24
        Bir sayı gir : 16
        Bir sayı gir : 20
        Bir sayı gir : 84
        Bir sayı gir : 37
        Total : 144

```

<br />

# LINK

* Click here https://github.com/Fogo9/CoefficientSum.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |
