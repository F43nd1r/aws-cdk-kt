package com.faendir.awscdkkt.services.elasticache

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
  initializer: CfnReplicationGroup.() -> Unit = {},
): CfnReplicationGroup = CfnReplicationGroup(this, id, props).apply(initializer)
