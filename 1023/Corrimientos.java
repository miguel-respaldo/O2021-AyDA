/*
 * Copyright (C) <year> <name of author>
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

public class Corrimientos {

    public static void main(String []args) {
        int numero = 4; // 100
        int res = numero / 2; // 10

        System.out.println("El valor de número es: " + numero);
        System.out.println("El valor de res es: " + res);

        res = numero >> 1; // 100 ->  1 =  10
        System.out.println("El valor de res es: " + res);

        numero =  7; // 111 
        res = numero >> 1; // 111 ->  1 =  11

        System.out.println("El valor de número es: " + numero);
        System.out.println("El valor de res es: " + res);

        numero =  15; // 1111
        res = numero >> 2; // 1111 ->  2 =  11

        System.out.println("El valor de número es: " + numero);

        System.out.println("El valor de res es: " + res);
        res = numero / 4; 
        System.out.println("El valor de res es: " + res);
    }
}

/*
 * Editor modelines  -  https://www.wireshark.org/tools/modelines.html
 *
 * Local variables:
 * c-basic-offset: 4
 * tab-width: 4
 * indent-tabs-mode: nil
 * End:
 *
 * vi: set shiftwidth=4 tabstop=4 expandtab:
 * :indentSize=4:tabSize=4:noTabs=true:
 */

