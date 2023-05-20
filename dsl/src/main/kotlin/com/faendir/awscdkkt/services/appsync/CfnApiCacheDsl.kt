@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
