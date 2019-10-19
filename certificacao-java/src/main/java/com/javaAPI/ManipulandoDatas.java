package com.javaAPI;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

public class ManipulandoDatas {
	
	public static void main(String[] args) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 

		//https://receitasdecodigo.com.br/java/converter-date-para-localdate-ou-localdatetime-do-java-8
		Date tempoPrevisao = new Date();
		LocalDateTime localTempoPrevisao = tempoPrevisao.toInstant().atZone(ZoneId.systemDefault() ).toLocalDateTime();
		LocalDateTime localDateTempoPrevisao = LocalDateTime.of(localTempoPrevisao.getYear(), localTempoPrevisao.getMonthValue(), localTempoPrevisao.getDayOfMonth(), localTempoPrevisao.getHour(), localTempoPrevisao.getMinute());
		
		LocalDateTime localDtAtual = LocalDateTime.now();
		LocalDateTime localDateAtual = LocalDateTime.of(localDtAtual.getYear(), localDtAtual.getMonthValue(), localDtAtual.getDayOfMonth(), localDtAtual.getHour(), localDtAtual.getMinute());
		
        boolean isDataAutalPrevisao = localDateAtual.isAfter(localDateTempoPrevisao);
        System.out.println("localDateTempoPrevisao :: " + localDateTempoPrevisao);
        System.out.println("localDateAtual :: " + localDateAtual);
        System.out.println("nineApr is posterior fourApr :: " + isDataAutalPrevisao);
				
		
		// TODO Auto-generated method stub
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate today = LocalDate.now();
		System.out.println(fimDeSemana(today));
		LocalDate data = LocalDate.parse("30/07/2019", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		//LocalDate data = LocalDate.parse("30/07/2019", dateTimeFormatter);
		data = data.plusDays(5);
		System.out.println(data.format(dateTimeFormatter));
		LocalDate emissaoRG = LocalDate.of(2000, 1, 15);
		System.out.println(emissaoRG.format(dateTimeFormatter));
		LocalDate localDate = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
		//CONVERTER DATE PARA LOCALDATE
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.SHORT, new Locale("pt")).toUpperCase());
		
		
		System.out.println("aaa "+localDate.getDayOfMonth());
		System.out.println("aaa "+localDate.getMonthValue());
		System.out.println("aaa "+localDate.getYear());
		System.out.println("aaa "+localDate.getDayOfWeek());
		
		//COMPARAR DATAS
		LocalDate nineApr = LocalDate.parse("2019-04-09");
        
        LocalDate fourApr = LocalDate.parse("2019-04-04");
        
        LocalDate equal = LocalDate.parse("2019-04-09");
         
        boolean isBefore = nineApr.isBefore(fourApr);
        System.out.println("nineApr is anterior  fourApr :: " + isBefore);
         
        boolean isAfter = nineApr.isAfter(fourApr);
        System.out.println("nineApr is posterior fourApr :: " + isAfter);
         
        boolean isEqual = nineApr.isEqual(LocalDate.of(2019, 4, 9));
        System.out.println("nineApr is equal to 04-09 :: " + today.isEqual(localDate));
        System.out.println("nineApr is equal to 04-09 :: " + isEqual);
        System.out.println("nineApr is equal to 04-09 :: " + nineApr.isEqual(equal));
        
        
		LocalDate localDate1 = LocalDate.of(2018, 6, 28);
        System.out.println("LocalDate = " + localDate);

        Date date1 = Date.from(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Date      = " + date1);

        localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("LocalDate = " + localDate1);
        
        //https://dicasdejava.com.br/java-como-converter-localdate-e-localdatetime-em-date-e-vice-versa/

	}
	
	public static boolean fimDeSemana(LocalDate ld) {
	    DayOfWeek d = ld.getDayOfWeek();
	    return d == DayOfWeek.SATURDAY || d == DayOfWeek.SUNDAY;
	}

}
