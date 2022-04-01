package com.example.testprogrami;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorular {
    ArrayList<String> s = new ArrayList<String>(Arrays.asList(
            "Bilgiler geçici olarak hangi bellek üzerinde tutulur?",
            "Aşağıdakilerden hangisinde bellek birimleri küçükten büyüğe doğru sıralanmıştır?",
            "Aşağıdakilerden hangisi bilgisayar birimi değildir?",
            "Aşağıdaki portlardan hangisinde Tak-ve-Çalıştır(Pnp) desteği vardır?",
            "İşaretleme yolu ile verileri girmek hangi üniteyle gerçekleşir?"
    ));

    ArrayList<String>[] sec = new ArrayList[5];

    ArrayList<String> cev = new ArrayList<String>(Arrays.asList(
            "Ram",
            "Byte- Kilobyte- Megabyte- Gigabyte",
            "Daktilo",
            "USB",
            "Mouse"
    ));

    Sorular() {
        for (int i = 0; i < 5; i++) {
            sec[i] = new ArrayList<String>();
        }
        sec[0].add("Memory Card");
        sec[0].add("Hard disk");
        sec[0].add("Rom");
        sec[0].add("Ram");

        sec[1].add("Byte- Kilobyte- Megabyte- Gigabyte");
        sec[1].add("Byte- Kilobyte- Gigabyte- Megabyte");
        sec[1].add("Gigabyte- Kilobyte- Byte- Megabyte");
        sec[1].add("Megabyte- Kilobyte- Byte- Gigabyte");

        sec[2].add("Klavye");
        sec[2].add("Ekran");
        sec[2].add("Mouse");
        sec[2].add("Daktilo");

        sec[3].add("HDD");
        sec[3].add("CPU");
        sec[3].add("ROM");
        sec[3].add("USB");

        sec[4].add("Klavye");
        sec[4].add("Mouse");
        sec[4].add("Yazıcı");
        sec[4].add("Mikrofon");
    }

}
