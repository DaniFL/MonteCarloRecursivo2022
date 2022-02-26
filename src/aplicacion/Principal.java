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
 * Paquete aplicacion que contiene la clase Principal.
 */
package aplicacion;

import static dominio.Matematicas.recursivoPi;

/**
 * Clase Principal que contiene el método main.
 */
public class Principal {

    /**
     * Método Main que inicializa el programa.
     * @param args array de argumentos que recibe los valores necesarios para realizar la aproximación.
     */
    public static void main(String[] args) {
        double result = recursivoPi(400, 0,400);
        System.out.println("El número Pi es: " + result);

    }
}
