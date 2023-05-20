@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
