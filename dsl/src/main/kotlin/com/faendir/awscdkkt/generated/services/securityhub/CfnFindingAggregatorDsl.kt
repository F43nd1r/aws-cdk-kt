package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnFindingAggregator
import software.amazon.awscdk.services.securityhub.CfnFindingAggregatorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFindingAggregator(
  id: String,
  props: CfnFindingAggregatorProps,
  initializer: @AwsCdkDsl CfnFindingAggregator.() -> Unit = {},
): CfnFindingAggregator = CfnFindingAggregator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFindingAggregator(id: String, initializer: @AwsCdkDsl
    CfnFindingAggregator.Builder.() -> Unit = {}): CfnFindingAggregator =
    CfnFindingAggregator.Builder.create(this, id).apply(initializer).build()
