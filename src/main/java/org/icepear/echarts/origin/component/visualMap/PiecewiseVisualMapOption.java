package org.icepear.echarts.origin.component.visualMap;

import org.icepear.echarts.component.VisualPiece;

/**
 * https://github.com/apache/echarts/blob/0114414eed6d0f9d1bb951459517e21ae557989f/src/component/visualMap/PiecewiseModel.ts#L70
 */
public interface PiecewiseVisualMapOption extends VisualMapOption {

	PiecewiseVisualMapOption setAlign(String align);

	PiecewiseVisualMapOption setMinOpen(Boolean minOpen);

	PiecewiseVisualMapOption setMaxOpen(Boolean maxOpen);

	PiecewiseVisualMapOption setItemWidth(Number itemWidth);

	PiecewiseVisualMapOption setItemHeight(Number itemHeight);

	PiecewiseVisualMapOption setItemSymbol(String itemSymbol);

	PiecewiseVisualMapOption setPieces(VisualPiece[] pieces);

	PiecewiseVisualMapOption setCategories(String[] categories);

	PiecewiseVisualMapOption setSplitNumber(Number splitNumber);

	PiecewiseVisualMapOption setSelected(Object selected);

	PiecewiseVisualMapOption setSelectedMode(String selectedMode);

	PiecewiseVisualMapOption setShowLabel(Boolean showLabel);

	PiecewiseVisualMapOption setItemGap(Number itemGap);

	PiecewiseVisualMapOption setHoverLink(Boolean hoverLink);
}
