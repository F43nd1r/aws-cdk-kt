@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnUserGroup
import software.amazon.awscdk.services.elasticache.CfnUserGroupProps
import software.constructs.Construct

public fun Construct.cfnUserGroup(
  id: String,
  props: CfnUserGroupProps,
  initializer: CfnUserGroup.() -> Unit = {},
): CfnUserGroup = CfnUserGroup(this, id, props).apply(initializer)
