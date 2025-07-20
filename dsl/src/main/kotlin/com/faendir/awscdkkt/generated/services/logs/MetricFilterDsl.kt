package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.MetricFilter
import software.amazon.awscdk.services.logs.MetricFilterProps
import software.constructs.Construct

@Generated
public fun Construct.metricFilter(
  id: String,
  props: MetricFilterProps,
  initializer: @AwsCdkDsl MetricFilter.() -> Unit = {},
): MetricFilter = MetricFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildMetricFilter(id: String, initializer: @AwsCdkDsl MetricFilter.Builder.() -> Unit = {}): MetricFilter = MetricFilter.Builder.create(this, id).apply(initializer).build()
