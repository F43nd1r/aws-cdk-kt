package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream
import software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMetricStream(id: String, props: CfnMetricStreamProps): CfnMetricStream =
    CfnMetricStream(this, id, props)

@Generated
public fun Construct.cfnMetricStream(
  id: String,
  props: CfnMetricStreamProps,
  initializer: @AwsCdkDsl CfnMetricStream.() -> Unit,
): CfnMetricStream = CfnMetricStream(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMetricStream(id: String, initializer: @AwsCdkDsl
    CfnMetricStream.Builder.() -> Unit): CfnMetricStream = CfnMetricStream.Builder.create(this,
    id).apply(initializer).build()
