package com.faendir.awscdkkt.services.elasticache

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
  initializer: CfnGlobalReplicationGroup.() -> Unit = {},
): CfnGlobalReplicationGroup = CfnGlobalReplicationGroup(this, id, props).apply(initializer)
