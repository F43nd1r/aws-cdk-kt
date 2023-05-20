@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream
import software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps
import software.constructs.Construct

public fun Construct.cfnMetricStream(
  id: String,
  props: CfnMetricStreamProps,
  initializer: CfnMetricStream.() -> Unit = {},
): CfnMetricStream = CfnMetricStream(this, id, props).apply(initializer)
