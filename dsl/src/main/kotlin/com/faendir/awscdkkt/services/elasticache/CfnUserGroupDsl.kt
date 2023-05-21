package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnUserGroup
import software.amazon.awscdk.services.elasticache.CfnUserGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserGroup(
  id: String,
  props: CfnUserGroupProps,
  initializer: CfnUserGroup.() -> Unit = {},
): CfnUserGroup = CfnUserGroup(this, id, props).apply(initializer)
