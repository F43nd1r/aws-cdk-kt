package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnFleetMetric
import software.amazon.awscdk.services.iot.CfnFleetMetricProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFleetMetric(
  id: String,
  props: CfnFleetMetricProps,
  initializer: @AwsCdkDsl CfnFleetMetric.() -> Unit = {},
): CfnFleetMetric = CfnFleetMetric(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFleetMetric(id: String, initializer: @AwsCdkDsl
    CfnFleetMetric.Builder.() -> Unit = {}): CfnFleetMetric = CfnFleetMetric.Builder.create(this,
    id).apply(initializer).build()
