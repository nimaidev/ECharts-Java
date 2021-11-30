package org.icepear.echarts.bar;

import static org.junit.Assert.assertEquals;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.icepear.echarts.component.AxisPointer;
import org.icepear.echarts.component.BarSeries;
import org.icepear.echarts.component.CategoryAxis;
import org.icepear.echarts.component.CategoryAxisTick;
import org.icepear.echarts.component.Grid;
import org.icepear.echarts.component.Option;
import org.icepear.echarts.component.Tooltip;
import org.icepear.echarts.component.ValueAxis;
import org.icepear.echarts.component.Axis;
import org.icepear.echarts.serializer.EChartSerializer;
import org.icepear.echarts.type.BoxLength;
import org.junit.Test;

public class AxisAlignWithTickTest {
    @Test
    public void testAxisAlignWithTick() {
        Tooltip tooltip = new Tooltip()
                .setTrigger("axis")
                .setAxisPointer(new AxisPointer()
                        .setType("shadow"));

        Grid grid = new Grid()
                .setLeft(new BoxLength<String>("3%"))
                .setRight(new BoxLength<String>("4%"))
                .setBottom(new BoxLength<String>("3%"))
                .setContainLabel(true);

        Axis xAxis = new Axis()
                .setAxisBaseOption(new CategoryAxis()
                        .setType("category")
                        .setData(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"))
                        .setAxisTick(new CategoryAxisTick()
                                .setAlignWithLabel(true)));

        Axis yAxis = new Axis()
                .setAxisBaseOption(new ValueAxis()
                        .setType("value"));

        BarSeries series = new BarSeries()
                .setName("Direct")
                .setType("bar")
                .setBarWidth(new BoxLength<String>("60%"))
                .setData(Arrays.asList(10, 52, 200, 334, 390, 330, 220));

        Option option = new Option()
                .setTooltip(Arrays.asList(tooltip))
                .setGrid(Arrays.asList(grid))
                .setXAxis(Arrays.asList(xAxis))
                .setYAxis(Arrays.asList(yAxis))
                .setSeries(Arrays.asList(series));

        Reader reader = new InputStreamReader(
                this.getClass().getResourceAsStream("/bar/axis-align-with-tick.json"));
        JsonElement expected = JsonParser.parseReader(reader);
        JsonElement actual = EChartSerializer.toJsonTree(option);
        assertEquals(expected, actual);

        // System.out.println(EChartSerializer.toJson(option));
    }
}