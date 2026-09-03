package com.faendir.awscdkkt.generated.services.omics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnRunCache
import software.amazon.awscdk.services.omics.CfnRunCacheProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRunCache(id: String, initializer: @AwsCdkDsl CfnRunCache.() -> Unit = {}): CfnRunCache = CfnRunCache(this, id).apply(initializer)

@Generated
public fun Construct.cfnRunCache(
  id: String,
  props: CfnRunCacheProps,
  initializer: @AwsCdkDsl CfnRunCache.() -> Unit = {},
): CfnRunCache = CfnRunCache(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRunCache(id: String, initializer: @AwsCdkDsl CfnRunCache.Builder.() -> Unit = {}): CfnRunCache = CfnRunCache.Builder.create(this, id).apply(initializer).build()
