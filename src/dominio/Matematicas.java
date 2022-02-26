/*
Copyright [2022] [Daniel Fernández López]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

/**
 * Paquete dominio que contiene la clase Matematicas.
 */
package dominio;

/**
 * Clase Matematicas que contiene el método recursivo.
 */
public class Matematicas {

    /**
     * Método recursivo que se aproxima a Pi.
     * @param n número de dardos que quedan por tirar.
     * @param d número de aciertos.
     * @param intentos número de intentos a realizar.
     * @return devuelve la aproximación al número pi.
     */
    static public double recursivoPi(double n, double d, double intentos) {

        //Caso Base
        if(n == 0) {
            return 4 * d / intentos;
        }else {
            double X = Math.random() * 2 - 1;
            double Y = Math.random() * 2 - 1;
            if (((X * X) + (Y * Y) <= 1)) {
                d++;
            }
            return recursivoPi(n-1, d, intentos);
        }
    }
}
