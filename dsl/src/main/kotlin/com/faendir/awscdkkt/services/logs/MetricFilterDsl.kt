@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.MetricFilter
import software.amazon.awscdk.services.logs.MetricFilterProps
import software.constructs.Construct

public fun Construct.metricFilter(
  id: String,
  props: MetricFilterProps,
  initializer: MetricFilter.() -> Unit = {},
): MetricFilter = MetricFilter(this, id, props).apply(initializer)
