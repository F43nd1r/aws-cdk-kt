package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngress
import software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityGroupIngress(
  id: String,
  props: CfnSecurityGroupIngressProps,
  initializer: CfnSecurityGroupIngress.() -> Unit = {},
): CfnSecurityGroupIngress = CfnSecurityGroupIngress(this, id, props).apply(initializer)
