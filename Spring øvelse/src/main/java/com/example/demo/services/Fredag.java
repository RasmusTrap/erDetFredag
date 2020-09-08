package com.example.demo.services;

import java.time.LocalDate;
import java.util.Calendar;

public class Fredag {
    public static void main(String[] args) {
        Fredag f = new Fredag();
        f.erDetFredag();

    }



        public String erDetFredag() {
            LocalDate date = LocalDate.now();
            int q = date.getDayOfMonth();
            int m = date.getMonthValue();
            int j = date.getYear() / 100;
            int k = date.getYear() % 100;


            int h = (q + (13 * (m + 1)/ 5 )+ k + (k / 4 )+ (j / 4) - 2 * j)%7;
            int d = ((h + 5 )%7)+ 1;
            double dayOfWeek = Math.floor(d);

            if(dayOfWeek == 5.0){
                return "Ja";
            }else{
                return "Nej";
            }

        }

    }

