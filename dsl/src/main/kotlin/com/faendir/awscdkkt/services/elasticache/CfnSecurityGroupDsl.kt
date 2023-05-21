package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnSecurityGroup
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityGroup(
  id: String,
  props: CfnSecurityGroupProps,
  initializer: CfnSecurityGroup.() -> Unit = {},
): CfnSecurityGroup = CfnSecurityGroup(this, id, props).apply(initializer)
