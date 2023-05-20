@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnMetricFilter
import software.amazon.awscdk.services.logs.CfnMetricFilterProps
import software.constructs.Construct

public fun Construct.cfnMetricFilter(
  id: String,
  props: CfnMetricFilterProps,
  initializer: CfnMetricFilter.() -> Unit = {},
): CfnMetricFilter = CfnMetricFilter(this, id, props).apply(initializer)
