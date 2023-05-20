@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CfnDistributionProps
import software.constructs.Construct

public fun Construct.cfnDistribution(
  id: String,
  props: CfnDistributionProps,
  initializer: CfnDistribution.() -> Unit = {},
): CfnDistribution = CfnDistribution(this, id, props).apply(initializer)
