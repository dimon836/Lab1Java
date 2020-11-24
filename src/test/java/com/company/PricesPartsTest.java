package com.company;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PricesPartsTest {
    @Test
    void getAverage_CheckAverageOfPartsPrices_OneHundredAndTen() {
        PricesParts pricesParts = Mockito.mock(PricesParts.class);
        float a = 100, b = 110, c = 120;
        pricesParts.setBody_parts(a);
        pricesParts.setCPU(b);
        pricesParts.setMotherboard(c);
        when(pricesParts.getAverage()).thenReturn((a+b+c)/3);
        Shop shop = new Shop();
        assertEquals(shop.getAverage(pricesParts, a, b, c), (a+b+c)/3);
        verify(pricesParts).getAverage();
    }
}
