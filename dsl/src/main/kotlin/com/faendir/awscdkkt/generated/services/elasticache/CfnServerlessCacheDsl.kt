package com.faendir.awscdkkt.generated.services.elasticache

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnServerlessCache
import software.amazon.awscdk.services.elasticache.CfnServerlessCacheProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServerlessCache(
  id: String,
  props: CfnServerlessCacheProps,
  initializer: @AwsCdkDsl CfnServerlessCache.() -> Unit = {},
): CfnServerlessCache = CfnServerlessCache(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServerlessCache(id: String, initializer: @AwsCdkDsl
    CfnServerlessCache.Builder.() -> Unit = {}): CfnServerlessCache =
    CfnServerlessCache.Builder.create(this, id).apply(initializer).build()
