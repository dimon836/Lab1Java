package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Spy;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

class ShopIT {

    @Mock
    private Shop objectShopMock = new Shop();
    private final Part body_partsMock = new Part("Parts of body", 200,1);
    private final Part CPUMock = new Part("CPU", 215, 1);

    @Test
    void get_GetByIndexPart_CompareClassMethodWithArrayMethod() {
        objectShopMock.getParts().add(body_partsMock);
        objectShopMock.getParts().add(CPUMock);
        Assertions.assertEquals(objectShopMock.getByIndexPart(1), objectShopMock.getParts().get(1));
    }

    @Spy
    private Shop objectShopSpy = new Shop();
    private final Part body_partsSpy = new Part("Parts of body", 200,1);
    private final Part CPUSpy = new Part("CPU", 215, 1);

    @Test
    void getAvgPartsPrice() {
        objectShopSpy.getParts().add(body_partsSpy);
        objectShopSpy.getParts().add(CPUSpy);
        Assertions.assertEquals(objectShopSpy.getAvgPartsPrice(),
                (body_partsSpy.getPrice() + CPUSpy.getPrice())/2.0);
    }

    @Test
    void getMinName() {
        objectShopSpy.getParts().add(body_partsSpy);
        objectShopSpy.getParts().add(CPUSpy);
        double[] pricesOfParts = objectShopSpy.getParts().stream().mapToDouble(Part::getPrice).toArray();
        DoubleSummaryStatistics doubleSummaryStatistics = DoubleStream.of(pricesOfParts).summaryStatistics();
        Assertions.assertEquals(objectShopSpy.getMinName(doubleSummaryStatistics.getMin()),
                body_partsSpy.getName());
    }

    @Test
    void getMaxName() {
        objectShopSpy.getParts().add(body_partsSpy);
        objectShopSpy.getParts().add(CPUSpy);
        double[] pricesOfParts = objectShopSpy.getParts().stream().mapToDouble(Part::getPrice).toArray();
        DoubleSummaryStatistics doubleSummaryStatistics = DoubleStream.of(pricesOfParts).summaryStatistics();
        Assertions.assertEquals(objectShopSpy.getMaxName(doubleSummaryStatistics.getMax()),
                CPUSpy.getName());
    }
}