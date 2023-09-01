package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CachePolicy
import software.amazon.awscdk.services.cloudfront.CachePolicyProps
import software.constructs.Construct

@Generated
public fun Construct.cachePolicy(id: String, initializer: @AwsCdkDsl CachePolicy.() -> Unit = {}):
    CachePolicy = CachePolicy(this, id).apply(initializer)

@Generated
public fun Construct.cachePolicy(
  id: String,
  props: CachePolicyProps,
  initializer: @AwsCdkDsl CachePolicy.() -> Unit = {},
): CachePolicy = CachePolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCachePolicy(id: String, initializer: @AwsCdkDsl
    CachePolicy.Builder.() -> Unit = {}): CachePolicy = CachePolicy.Builder.create(this,
    id).apply(initializer).build()
