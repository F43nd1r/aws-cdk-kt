package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream
import software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMetricStream(
  id: String,
  props: CfnMetricStreamProps,
  initializer: CfnMetricStream.() -> Unit = {},
): CfnMetricStream = CfnMetricStream(this, id, props).apply(initializer)
