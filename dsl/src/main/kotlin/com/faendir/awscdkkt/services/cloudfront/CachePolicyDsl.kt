@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CachePolicy
import software.amazon.awscdk.services.cloudfront.CachePolicyProps
import software.constructs.Construct

public fun Construct.cachePolicy(id: String, initializer: CachePolicy.() -> Unit = {}): CachePolicy
    = CachePolicy(this, id).apply(initializer)

public fun Construct.cachePolicy(
  id: String,
  props: CachePolicyProps,
  initializer: CachePolicy.() -> Unit = {},
): CachePolicy = CachePolicy(this, id, props).apply(initializer)
