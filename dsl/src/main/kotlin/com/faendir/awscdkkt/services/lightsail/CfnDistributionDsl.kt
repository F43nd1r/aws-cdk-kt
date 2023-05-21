package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnDistribution
import software.amazon.awscdk.services.lightsail.CfnDistributionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDistribution(
  id: String,
  props: CfnDistributionProps,
  initializer: CfnDistribution.() -> Unit = {},
): CfnDistribution = CfnDistribution(this, id, props).apply(initializer)
