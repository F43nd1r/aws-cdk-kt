@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnCacheCluster
import software.amazon.awscdk.services.elasticache.CfnCacheClusterProps
import software.constructs.Construct

public fun Construct.cfnCacheCluster(
  id: String,
  props: CfnCacheClusterProps,
  initializer: CfnCacheCluster.() -> Unit = {},
): CfnCacheCluster = CfnCacheCluster(this, id, props).apply(initializer)
