@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnSecurityGroup
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps
import software.constructs.Construct

public fun Construct.cfnSecurityGroup(
  id: String,
  props: CfnSecurityGroupProps,
  initializer: CfnSecurityGroup.() -> Unit = {},
): CfnSecurityGroup = CfnSecurityGroup(this, id, props).apply(initializer)
