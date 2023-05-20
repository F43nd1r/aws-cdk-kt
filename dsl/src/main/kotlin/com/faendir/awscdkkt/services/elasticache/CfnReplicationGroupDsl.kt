@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup
import software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps
import software.constructs.Construct

public fun Construct.cfnReplicationGroup(
  id: String,
  props: CfnReplicationGroupProps,
  initializer: CfnReplicationGroup.() -> Unit = {},
): CfnReplicationGroup = CfnReplicationGroup(this, id, props).apply(initializer)
