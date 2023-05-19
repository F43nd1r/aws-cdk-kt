@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
