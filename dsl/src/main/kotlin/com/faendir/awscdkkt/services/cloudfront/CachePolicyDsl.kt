package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CachePolicy
import software.amazon.awscdk.services.cloudfront.CachePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cachePolicy(id: String, initializer: CachePolicy.() -> Unit = {}): CachePolicy
    = CachePolicy(this, id).apply(initializer)

@Generated
public fun Construct.cachePolicy(
  id: String,
  props: CachePolicyProps,
  initializer: CachePolicy.() -> Unit = {},
): CachePolicy = CachePolicy(this, id, props).apply(initializer)
