package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnCustomMetric
import software.amazon.awscdk.services.iot.CfnCustomMetricProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomMetric(
  id: String,
  props: CfnCustomMetricProps,
  initializer: CfnCustomMetric.() -> Unit = {},
): CfnCustomMetric = CfnCustomMetric(this, id, props).apply(initializer)
