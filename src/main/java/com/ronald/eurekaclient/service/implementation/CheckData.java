package com.ronald.eurekaclient.service.implementation;

import com.ronald.eurekaclient.service.CheckDataExtern;

public class CheckData {
    CheckDataExtern checkDataExtern;

    public String dniEntry(String dni)
    {
        return checkDataExtern.CheckData(dni);
    }
}
