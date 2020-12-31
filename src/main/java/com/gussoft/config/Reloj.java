package com.gussoft.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;

public class Reloj extends Thread {

    JLabel lblReloj;
    JLabel lblFecha;
    public static Calendar calendar = Calendar.getInstance();
    private static String fecha;

    public Reloj(JLabel lblReloj, JLabel lblFecha) {
        this.lblReloj = lblReloj;
        this.lblFecha = lblFecha;
    }

    public void run() {
        while (true) {
            Date hoy = new Date();
            SimpleDateFormat sim = new SimpleDateFormat("H:mm:ss");
            SimpleDateFormat fec = new SimpleDateFormat("EEEEEEEEE dd 'de' MMMMM 'de' yyyy");
            lblFecha.setText(fec.format(hoy));
            lblReloj.setText(sim.format(hoy));
            try {
                sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public static String formatoFecha(String fecha) {
        String fechas = null;
        try {
            SimpleDateFormat fe = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat myFecha = new SimpleDateFormat("20" + "yy-MM-dd");

            fechas = myFecha.format(fe.parse(fecha));
        } catch (Exception e) {
            System.out.println("No se pudo convertir");
        }
        return fechas;
    }

    public static String fechaCompleta(String fecha) {
        String fechas = null;
        String horas = null;
        String horaCompleta = null;
        try {
            Date hoy = new Date();
            SimpleDateFormat df = new SimpleDateFormat("H:mm:ss");
            SimpleDateFormat fe = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat myFecha = new SimpleDateFormat("20" + "yy-MM-dd");
            fechas = myFecha.format(fe.parse(fecha));
            horas = df.format(hoy);
            horaCompleta = fechas + " " + horas;
        } catch (ParseException e) {
            System.out.println("No se pudo convertir la fecha completa");
        }
        return horaCompleta;
    }

    public static String darHora() {
        String hora = null;
        try {
            Date hoy = new Date();
            SimpleDateFormat df = new SimpleDateFormat("H:mm:ss");
            hora = df.format(hoy);
            System.out.println("La hora es " + hora);
        } catch (Exception e) {
            System.out.println("No se pudo mostrar la hora");
        }
        return hora;
    }

    public static String Fecha() {
        SimpleDateFormat fec = new SimpleDateFormat("dd-MM-yy");
        fecha = fec.format(calendar.getTime());
        return fecha;
    }

    public static String FechaDB() {
        SimpleDateFormat fec = new SimpleDateFormat("yyyy-MM-dd");
        fecha = fec.format(calendar.getTime());
        return fecha;
    }
}
