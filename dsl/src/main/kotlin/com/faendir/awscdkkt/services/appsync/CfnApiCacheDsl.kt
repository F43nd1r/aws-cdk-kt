@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnApiCache
import software.amazon.awscdk.services.appsync.CfnApiCacheProps
import software.constructs.Construct

public fun Construct.cfnApiCache(
  id: String,
  props: CfnApiCacheProps,
  initializer: CfnApiCache.() -> Unit = {},
): CfnApiCache = CfnApiCache(this, id, props).apply(initializer)
