@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps
import software.constructs.Construct

public fun Construct.cfnDBSecurityGroupIngress(
  id: String,
  props: CfnDBSecurityGroupIngressProps,
  initializer: CfnDBSecurityGroupIngress.() -> Unit = {},
): CfnDBSecurityGroupIngress = CfnDBSecurityGroupIngress(this, id, props).apply(initializer)
