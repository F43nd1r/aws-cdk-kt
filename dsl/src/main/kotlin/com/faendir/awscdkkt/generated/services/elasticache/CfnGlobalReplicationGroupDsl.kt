package com.faendir.awscdkkt.generated.services.elasticache

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGlobalReplicationGroup(
  id: String,
  props: CfnGlobalReplicationGroupProps,
  initializer: @AwsCdkDsl CfnGlobalReplicationGroup.() -> Unit = {},
): CfnGlobalReplicationGroup = CfnGlobalReplicationGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGlobalReplicationGroup(id: String, initializer: @AwsCdkDsl
    CfnGlobalReplicationGroup.Builder.() -> Unit = {}): CfnGlobalReplicationGroup =
    CfnGlobalReplicationGroup.Builder.create(this, id).apply(initializer).build()
