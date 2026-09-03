package com.faendir.awscdkkt.generated.services.personalize

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnMetricAttribution
import software.amazon.awscdk.services.personalize.CfnMetricAttributionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMetricAttribution(
  id: String,
  props: CfnMetricAttributionProps,
  initializer: @AwsCdkDsl CfnMetricAttribution.() -> Unit = {},
): CfnMetricAttribution = CfnMetricAttribution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMetricAttribution(id: String, initializer: @AwsCdkDsl CfnMetricAttribution.Builder.() -> Unit = {}): CfnMetricAttribution = CfnMetricAttribution.Builder.create(this, id).apply(initializer).build()
