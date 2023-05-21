package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnFleetMetric
import software.amazon.awscdk.services.iot.CfnFleetMetricProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFleetMetric(
  id: String,
  props: CfnFleetMetricProps,
  initializer: CfnFleetMetric.() -> Unit = {},
): CfnFleetMetric = CfnFleetMetric(this, id, props).apply(initializer)
