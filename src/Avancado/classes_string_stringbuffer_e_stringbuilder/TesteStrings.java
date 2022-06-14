package Avancado.classes_string_stringbuffer_e_stringbuilder;

import java.sql.SQLOutput;

public class TesteStrings {
    public static void main(String[] args) {

        StringBuilder BomDia = new StringBuilder("Bom dia: ");

        BomDia.append(" Rodrigo Lacerda");
        String resultado = BomDia.toString();
        System.out.println(resultado);

        BomDia.delete(9,31);
        System.out.println(BomDia + " Monica");

    }
}
