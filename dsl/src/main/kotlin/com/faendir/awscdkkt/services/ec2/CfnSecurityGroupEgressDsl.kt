@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgress
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps
import software.constructs.Construct

public fun Construct.cfnSecurityGroupEgress(
  id: String,
  props: CfnSecurityGroupEgressProps,
  initializer: CfnSecurityGroupEgress.() -> Unit = {},
): CfnSecurityGroupEgress = CfnSecurityGroupEgress(this, id, props).apply(initializer)
