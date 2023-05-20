@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroup
import software.amazon.awscdk.services.ec2.CfnSecurityGroupProps
import software.constructs.Construct

public fun Construct.cfnSecurityGroup(
  id: String,
  props: CfnSecurityGroupProps,
  initializer: CfnSecurityGroup.() -> Unit = {},
): CfnSecurityGroup = CfnSecurityGroup(this, id, props).apply(initializer)
