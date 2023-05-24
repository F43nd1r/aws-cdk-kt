package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnMetricFilter
import software.amazon.awscdk.services.logs.CfnMetricFilterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMetricFilter(id: String, props: CfnMetricFilterProps): CfnMetricFilter =
    CfnMetricFilter(this, id, props)

@Generated
public fun Construct.cfnMetricFilter(
  id: String,
  props: CfnMetricFilterProps,
  initializer: @AwsCdkDsl CfnMetricFilter.() -> Unit,
): CfnMetricFilter = CfnMetricFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMetricFilter(id: String, initializer: @AwsCdkDsl
    CfnMetricFilter.Builder.() -> Unit): CfnMetricFilter = CfnMetricFilter.Builder.create(this,
    id).apply(initializer).build()
