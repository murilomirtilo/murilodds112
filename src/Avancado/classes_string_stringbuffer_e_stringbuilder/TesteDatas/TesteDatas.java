package Avancado.classes_string_stringbuffer_e_stringbuilder.TesteDatas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {
    public static void main(String[] args) {

        Date hoje = new Date();

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatador.format(hoje));

        String dataAniversario = "02/08/2022";
        DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date aniversario = formatador2.parse(dataAniversario);
            System.out.println(formatador2.format(aniversario));
        } catch (ParseException e) {
            System.out.println("Formato de data invalida");;
        }
    }
}
