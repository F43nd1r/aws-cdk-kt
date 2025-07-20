package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStreamingDistribution(
  id: String,
  props: CfnStreamingDistributionProps,
  initializer: @AwsCdkDsl CfnStreamingDistribution.() -> Unit = {},
): CfnStreamingDistribution = CfnStreamingDistribution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStreamingDistribution(id: String, initializer: @AwsCdkDsl CfnStreamingDistribution.Builder.() -> Unit = {}): CfnStreamingDistribution = CfnStreamingDistribution.Builder.create(this, id).apply(initializer).build()
