package com.faendir.awscdkkt.generated.services.elasticache

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnCacheCluster
import software.amazon.awscdk.services.elasticache.CfnCacheClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCacheCluster(
  id: String,
  props: CfnCacheClusterProps,
  initializer: @AwsCdkDsl CfnCacheCluster.() -> Unit = {},
): CfnCacheCluster = CfnCacheCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCacheCluster(id: String, initializer: @AwsCdkDsl
    CfnCacheCluster.Builder.() -> Unit = {}): CfnCacheCluster = CfnCacheCluster.Builder.create(this,
    id).apply(initializer).build()
