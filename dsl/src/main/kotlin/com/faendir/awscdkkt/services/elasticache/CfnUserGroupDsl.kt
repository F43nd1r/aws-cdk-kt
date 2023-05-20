@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
