package org.icepear.echarts.component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import org.icepear.echarts.origin.coord.AxisLabelBaseOption;
import org.icepear.echarts.origin.coord.AxisLineOption;
import org.icepear.echarts.origin.coord.AxisTickOption;
import org.icepear.echarts.origin.coord.MinorSplitLineOption;
import org.icepear.echarts.origin.coord.MinorTickOption;
import org.icepear.echarts.origin.coord.SplitAreaOption;
import org.icepear.echarts.origin.coord.SplitLineOption;
import org.icepear.echarts.origin.coord.polar.DefaultAngleAxisOption;
import org.icepear.echarts.origin.util.CommonAxisPointerOption;

@Accessors(chain=true)
@Data
public class DefaultAngleAxis implements DefaultAngleAxisOption {

	private Number polarIndex;

	private String polarId;

	private Number startAngle;

	private Boolean clockwise;

	private String mainType;

	private String type;

	@Setter(AccessLevel.NONE)
	private Object id;

	public DefaultAngleAxis setId(Number id) {
		this.id = id;
		return this;
	}

	public DefaultAngleAxis setId(String id) {
		this.id = id;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object name;

	public DefaultAngleAxis setName(Number name) {
		this.name = name;
		return this;
	}

	public DefaultAngleAxis setName(String name) {
		this.name = name;
		return this;
	}

	private Number z;

	private Number zlevel;

	private Boolean animation;

	private Number animationThreshold;

	@Setter(AccessLevel.NONE)
	private Object animationDuration;

	public DefaultAngleAxis setAnimationDuration(Number animationDuration) {
		this.animationDuration = animationDuration;
		return this;
	}

	public DefaultAngleAxis setAnimationDuration(Object animationDuration) {
		this.animationDuration = animationDuration;
		return this;
	}

	private Object animationEasing;

	@Setter(AccessLevel.NONE)
	private Object animationDelay;

	public DefaultAngleAxis setAnimationDelay(Number animationDelay) {
		this.animationDelay = animationDelay;
		return this;
	}

	public DefaultAngleAxis setAnimationDelay(Object animationDelay) {
		this.animationDelay = animationDelay;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object animationDurationUpdate;

	public DefaultAngleAxis setAnimationDurationUpdate(Number animationDurationUpdate) {
		this.animationDurationUpdate = animationDurationUpdate;
		return this;
	}

	public DefaultAngleAxis setAnimationDurationUpdate(Object animationDurationUpdate) {
		this.animationDurationUpdate = animationDurationUpdate;
		return this;
	}

	private Object animationEasingUpdate;

	@Setter(AccessLevel.NONE)
	private Object animationDelayUpdate;

	public DefaultAngleAxis setAnimationDelayUpdate(Number animationDelayUpdate) {
		this.animationDelayUpdate = animationDelayUpdate;
		return this;
	}

	public DefaultAngleAxis setAnimationDelayUpdate(Object animationDelayUpdate) {
		this.animationDelayUpdate = animationDelayUpdate;
		return this;
	}

	private Boolean show;

	private Boolean inverse;

	private String nameLocation;

	private Number nameRotate;

	private Object nameTruncate;

	private Object nameTextStyle;

	private Number nameGap;

	private Boolean silent;

	private Boolean triggerEvent;

	private Object tooltip;

	private AxisLabelBaseOption axisLabel;

	private CommonAxisPointerOption axisPointer;

	private AxisLineOption axisLine;

	private AxisTickOption axisTick;

	private MinorTickOption minorTick;

	private SplitLineOption splitLine;

	private MinorSplitLineOption minorSplitLine;

	private SplitAreaOption splitArea;

	@Setter(AccessLevel.NONE)
	private Object min;

	public DefaultAngleAxis setMin(Number min) {
		this.min = min;
		return this;
	}

	public DefaultAngleAxis setMin(String min) {
		this.min = min;
		return this;
	}

	@Setter(AccessLevel.NONE)
	private Object max;

	public DefaultAngleAxis setMax(Number max) {
		this.max = max;
		return this;
	}

	public DefaultAngleAxis setMax(String max) {
		this.max = max;
		return this;
	}
}