package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PricesPartsTestMockito {
    @Test
    void divide_DivideRealNumbers_Quotient() {
        PricesParts pricesParts = Mockito.mock(PricesParts.class);
        float a = 100.0F;
        float b = 110.0F;
        float c = 120.0F;
        pricesParts.setBody_parts(a);
        pricesParts.setCPU(b);
        pricesParts.setMotherboard(c);
        Mockito.when(pricesParts.getAverage()).thenReturn((a + b + c) / 3.0F);
        Shop shop = new Shop();
        Assertions.assertEquals(shop.getAverage(pricesParts, a, b, c), (a + b + c) / 3.0F);
        Mockito.verify(pricesParts).getAverage();
    }
}