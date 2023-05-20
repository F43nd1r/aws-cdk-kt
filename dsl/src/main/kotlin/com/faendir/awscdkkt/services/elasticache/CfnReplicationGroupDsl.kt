@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
