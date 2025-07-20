package com.faendir.awscdkkt.generated.services.elasticache

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup
import software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReplicationGroup(
  id: String,
  props: CfnReplicationGroupProps,
  initializer: @AwsCdkDsl CfnReplicationGroup.() -> Unit = {},
): CfnReplicationGroup = CfnReplicationGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReplicationGroup(id: String, initializer: @AwsCdkDsl CfnReplicationGroup.Builder.() -> Unit = {}): CfnReplicationGroup = CfnReplicationGroup.Builder.create(this, id).apply(initializer).build()
