package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        int pilihan, tahun, hari, select;
        String waktu, isiCatatan;
        Integer bulan;

        ArrayList<DearDiary> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("==========MENU DIARY==========");
            System.out.println("1. Tambah Diary\n2. Lihat Diary\n3. Keluar");
            System.out.print("Masukkan Pilihan : ");
            pilihan = Integer.parseInt(br.readLine());

            switch (pilihan) {
                case 1:
                    System.out.print("Hari : ");
                    hari = Integer.parseInt(br.readLine());
                    System.out.print("Bulan : ");
                    bulan = Integer.parseInt(br.readLine());
                    if (bulan < 1 || bulan > 12) {
                        System.out.println("Inputan Salah");
                        break;
                    }
                    System.out.print("Tahun : ");
                    tahun = Integer.parseInt(br.readLine());
                    System.out.print("Waktu : ");
                    waktu = br.readLine();
                    System.out.print("Isi Catatan : ");
                    isiCatatan = br.readLine();
                    System.out.println("\n");

                    list.add(new DearDiary(hari,bulan, tahun, waktu, isiCatatan));
                    break;

                case 2:
                    int index = list.size() -1;

                    do {
                        System.out.println("1. Tampilkan Inputan Terakhir\n2. Next\n3. Selesai");
                        select = Integer.parseInt(br.readLine());
                        switch (select) {
                            case 1:
                                System.out.println(list.get(index).toString());
                                break;
                            case 2:
                                if (index == 0)
                                    System.out.println(list.get(index).toString());
                                else{
                                    index--;
                                    System.out.println(list.get(index).toString());
                                }
                                break;
                            case 3:
                                System.out.println("Selesai");
                                break;
                        }
                    }
                    while (select != 3);
                    break;

                case 3:
                    list.sort(new DearDiary.SortByName());
                    for (DearDiary diaryAl : list) {
                        System.out.println(diaryAl);
                    }
                    break;
            }
        }
        while (pilihan <= 3);
    }
}