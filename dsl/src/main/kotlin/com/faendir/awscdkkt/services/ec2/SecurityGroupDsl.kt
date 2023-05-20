@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SecurityGroup
import software.amazon.awscdk.services.ec2.SecurityGroupProps
import software.constructs.Construct

public fun Construct.securityGroup(
  id: String,
  props: SecurityGroupProps,
  initializer: SecurityGroup.() -> Unit = {},
): SecurityGroup = SecurityGroup(this, id, props).apply(initializer)
