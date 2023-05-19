@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
