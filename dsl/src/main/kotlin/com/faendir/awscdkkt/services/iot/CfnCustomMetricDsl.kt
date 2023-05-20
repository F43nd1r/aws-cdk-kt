@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnCustomMetric
import software.amazon.awscdk.services.iot.CfnCustomMetricProps
import software.constructs.Construct

public fun Construct.cfnCustomMetric(
  id: String,
  props: CfnCustomMetricProps,
  initializer: CfnCustomMetric.() -> Unit = {},
): CfnCustomMetric = CfnCustomMetric(this, id, props).apply(initializer)
