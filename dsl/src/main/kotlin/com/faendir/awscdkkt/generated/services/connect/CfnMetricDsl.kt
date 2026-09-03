package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnMetric
import software.amazon.awscdk.services.connect.CfnMetricProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMetric(
  id: String,
  props: CfnMetricProps,
  initializer: @AwsCdkDsl CfnMetric.() -> Unit = {},
): CfnMetric = CfnMetric(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMetric(id: String, initializer: @AwsCdkDsl CfnMetric.Builder.() -> Unit = {}): CfnMetric = CfnMetric.Builder.create(this, id).apply(initializer).build()
