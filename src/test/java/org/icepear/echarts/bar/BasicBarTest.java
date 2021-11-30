package org.icepear.echarts.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.BarSeries;
import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.component.Axis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.junit.Test;

public class BasicBarTest {
    @Test
    public void testBasicBar() {
        Axis xAxis = new Axis()
                .setAxisBaseOption(new CategoryAxis()
                        .setType("category")
                        .setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")));

        Axis yAxis = new Axis()
                .setAxisBaseOption(new ValueAxis()
                        .setType("value"));

        BarSeries series = new BarSeries()
                .setData(Arrays.asList(120, 200, 150, 80, 70, 110, 130))
                .setType("bar");

        Option option = new Option()
                .setXAxis(Arrays.asList(xAxis))
                .setYAxis(Arrays.asList(yAxis))
                .setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/bar/basic-bar.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}