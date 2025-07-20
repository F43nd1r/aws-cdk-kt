package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnAggregatorV2
import software.amazon.awscdk.services.securityhub.CfnAggregatorV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnAggregatorV2(
  id: String,
  props: CfnAggregatorV2Props,
  initializer: @AwsCdkDsl CfnAggregatorV2.() -> Unit = {},
): CfnAggregatorV2 = CfnAggregatorV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAggregatorV2(id: String, initializer: @AwsCdkDsl CfnAggregatorV2.Builder.() -> Unit = {}): CfnAggregatorV2 = CfnAggregatorV2.Builder.create(this, id).apply(initializer).build()
