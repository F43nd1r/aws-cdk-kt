package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CfnDistributionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDistribution(
  id: String,
  props: CfnDistributionProps,
  initializer: @AwsCdkDsl CfnDistribution.() -> Unit = {},
): CfnDistribution = CfnDistribution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDistribution(id: String, initializer: @AwsCdkDsl CfnDistribution.Builder.() -> Unit = {}): CfnDistribution = CfnDistribution.Builder.create(this, id).apply(initializer).build()
