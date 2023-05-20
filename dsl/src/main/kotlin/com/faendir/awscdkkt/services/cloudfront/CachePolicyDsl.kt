@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
