package Avancado.classes_string_stringbuffer_e_stringbuilder.Atividade_6_8_desafio_datas;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraGravidez extends Principal {


    private Date dataUltimoPeriodoMenstrual;

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }

    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }
/*
    private Date converterCalendarParaDate(Calendar calendar) {
        Date date = new Date();
        date.setTime(calendar);
        return date;
    }
*/

    public Date calcularDataEstimadaConcepcao() {

       Calendar dataConvertidaCalendarConcepcao = converterDateParaCalendar(dataUltimoPeriodoMenstrual);

       dataConvertidaCalendarConcepcao.add(Calendar.WEEK_OF_YEAR, 2);

       return dataConvertidaCalendarConcepcao.getTime();
        // implementar cálculo de data estimada da concepção
        // 2 semanas após a data do último período menstrual
    }

    public Date calcularDataEstimadaParto() {

        Calendar dataConvertidaParto = converterDateParaCalendar(dataUltimoPeriodoMenstrual);

        dataConvertidaParto.add(Calendar.WEEK_OF_YEAR, 40);

        return dataConvertidaParto.getTime();
        // implementar cálculo de data estimada para parto
        // 40 semanas após a data do último período menstrual

    }

}
