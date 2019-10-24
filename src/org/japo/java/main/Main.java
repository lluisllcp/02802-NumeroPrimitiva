/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        int numero = 0;
        System.out.println("Cual es su numero favorito de la loteria? ");

        try {
            numero = SCN.nextInt();
            boolean comparar = numero >= 1 && numero <= 49;

            System.out.printf("numero loteria ... : %d%n"
                    + "El numero no esta comoprendido entre 1 y 49 .... %b%n",
                    numero, comparar);
            

        } catch (Exception e) {
            System.out.println("La entrada es erronea");

        }

    }

}
