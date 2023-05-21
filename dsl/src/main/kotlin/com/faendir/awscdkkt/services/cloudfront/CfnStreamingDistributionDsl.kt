package com.faendir.awscdkkt.services.cloudfront

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
  initializer: CfnStreamingDistribution.() -> Unit = {},
): CfnStreamingDistribution = CfnStreamingDistribution(this, id, props).apply(initializer)
