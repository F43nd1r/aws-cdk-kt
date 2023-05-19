@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps
import software.constructs.Construct

public fun Construct.cfnGlobalReplicationGroup(
  id: String,
  props: CfnGlobalReplicationGroupProps,
  initializer: CfnGlobalReplicationGroup.() -> Unit = {},
): CfnGlobalReplicationGroup = CfnGlobalReplicationGroup(this, id, props).apply(initializer)
