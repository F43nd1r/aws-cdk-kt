@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupProps
import software.constructs.Construct

public fun Construct.cfnDBSecurityGroup(
  id: String,
  props: CfnDBSecurityGroupProps,
  initializer: CfnDBSecurityGroup.() -> Unit = {},
): CfnDBSecurityGroup = CfnDBSecurityGroup(this, id, props).apply(initializer)
