package com.faendir.awscdkkt.generated.services.elasticache

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReservedCacheNode
import software.amazon.awscdk.services.elasticache.CfnReservedCacheNodeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReservedCacheNode(id: String, initializer: @AwsCdkDsl CfnReservedCacheNode.() -> Unit = {}): CfnReservedCacheNode = CfnReservedCacheNode(this, id).apply(initializer)

@Generated
public fun Construct.cfnReservedCacheNode(
  id: String,
  props: CfnReservedCacheNodeProps,
  initializer: @AwsCdkDsl CfnReservedCacheNode.() -> Unit = {},
): CfnReservedCacheNode = CfnReservedCacheNode(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReservedCacheNode(id: String, initializer: @AwsCdkDsl CfnReservedCacheNode.Builder.() -> Unit = {}): CfnReservedCacheNode = CfnReservedCacheNode.Builder.create(this, id).apply(initializer).build()
