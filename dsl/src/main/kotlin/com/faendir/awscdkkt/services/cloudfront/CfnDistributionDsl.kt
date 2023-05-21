package com.faendir.awscdkkt.services.cloudfront

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
  initializer: CfnDistribution.() -> Unit = {},
): CfnDistribution = CfnDistribution(this, id, props).apply(initializer)
