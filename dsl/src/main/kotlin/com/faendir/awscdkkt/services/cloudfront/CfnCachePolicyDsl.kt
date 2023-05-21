package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy
import software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCachePolicy(
  id: String,
  props: CfnCachePolicyProps,
  initializer: CfnCachePolicy.() -> Unit = {},
): CfnCachePolicy = CfnCachePolicy(this, id, props).apply(initializer)
