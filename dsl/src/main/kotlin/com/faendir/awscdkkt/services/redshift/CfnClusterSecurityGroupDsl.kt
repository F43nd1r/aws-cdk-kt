@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroup
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps
import software.constructs.Construct

public fun Construct.cfnClusterSecurityGroup(
  id: String,
  props: CfnClusterSecurityGroupProps,
  initializer: CfnClusterSecurityGroup.() -> Unit = {},
): CfnClusterSecurityGroup = CfnClusterSecurityGroup(this, id, props).apply(initializer)
