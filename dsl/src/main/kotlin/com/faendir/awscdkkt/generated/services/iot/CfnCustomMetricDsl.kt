package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnCustomMetric
import software.amazon.awscdk.services.iot.CfnCustomMetricProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomMetric(id: String, props: CfnCustomMetricProps): CfnCustomMetric =
    CfnCustomMetric(this, id, props)

@Generated
public fun Construct.cfnCustomMetric(
  id: String,
  props: CfnCustomMetricProps,
  initializer: @AwsCdkDsl CfnCustomMetric.() -> Unit,
): CfnCustomMetric = CfnCustomMetric(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomMetric(id: String, initializer: @AwsCdkDsl
    CfnCustomMetric.Builder.() -> Unit): CfnCustomMetric = CfnCustomMetric.Builder.create(this,
    id).apply(initializer).build()
