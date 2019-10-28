/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
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

import java.util.Random;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //Calendar cal = Calendar.getInstance();
        final int VACAS = 3;
        final int PATAS_VACAS = 12;

        final int OVEJAS = 14;
        final int PATAS_OVEJAS = 56;

        final int BURROS = 2;
        final int PATAS_BURROS = 8;

        final int GALLINAS = 18;
        final int PATAS_GALLINAS = 36;

        System.out.println("Secuencia de Patas");
        System.out.println("==================");

        System.out.println("Animal .........: Vaca");
        System.out.println("Cantidad........: " + VACAS);
        System.out.println("Patas...........: " + PATAS_VACAS);

        System.out.println("");

        System.out.println("Animal...........: Oveja");
        System.out.println("Cantidad........: " + OVEJAS);
        System.out.println("Patas...........: " + PATAS_OVEJAS);

        System.out.println("");

        System.out.println("Animal...........: Burro");
        System.out.println("Cantidad........: " + BURROS);
        System.out.println("Patas...........: " + PATAS_BURROS);

        System.out.println("");

        System.out.println("Animal...........: Gallina");
        System.out.println("Cantidad........: " + GALLINAS);
        System.out.println("Patas...........: " + PATAS_GALLINAS);

        System.out.println("");

        int totalPatas = PATAS_VACAS + PATAS_OVEJAS + PATAS_BURROS + PATAS_GALLINAS;
        int totalPares = VACAS * 2 + OVEJAS * 2 + BURROS * 2 + GALLINAS;

        System.out.println("Total de Patas .: " + totalPatas);
        System.out.println("Total de Pares .: " + totalPares);

    }

}
