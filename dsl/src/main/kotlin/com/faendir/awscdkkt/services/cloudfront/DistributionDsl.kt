package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.Distribution
import software.amazon.awscdk.services.cloudfront.DistributionProps
import software.constructs.Construct

@Generated
public fun Construct.distribution(
  id: String,
  props: DistributionProps,
  initializer: Distribution.() -> Unit = {},
): Distribution = Distribution(this, id, props).apply(initializer)
