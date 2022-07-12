package com.ronald.eurekaclient.service.implementation;

import com.ronald.eurekaclient.service.CheckDataExtern;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

class CheckDataTestFailure {

    @Mock
    CheckDataExtern checkDataExtern;

    @InjectMocks
    CheckData checkData;

    @BeforeEach
    public void init()
    {
        MockitoAnnotations.openMocks(this);
        when(checkDataExtern.CheckData("70106169")).thenReturn("correcto");
    }

    @Test
    void dniEntryFail()
    {
        Assertions.assertEquals("correcto", checkData.dniEntry("a72fbb"));
    }
}
