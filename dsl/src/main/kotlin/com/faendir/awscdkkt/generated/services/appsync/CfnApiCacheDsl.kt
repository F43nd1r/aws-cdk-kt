package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnApiCache
import software.amazon.awscdk.services.appsync.CfnApiCacheProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApiCache(
  id: String,
  props: CfnApiCacheProps,
  initializer: @AwsCdkDsl CfnApiCache.() -> Unit = {},
): CfnApiCache = CfnApiCache(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApiCache(id: String, initializer: @AwsCdkDsl CfnApiCache.Builder.() -> Unit = {}): CfnApiCache = CfnApiCache.Builder.create(this, id).apply(initializer).build()
