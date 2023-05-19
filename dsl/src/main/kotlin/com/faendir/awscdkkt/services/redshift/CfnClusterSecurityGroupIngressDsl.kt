@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngress
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps
import software.constructs.Construct

public fun Construct.cfnClusterSecurityGroupIngress(
  id: String,
  props: CfnClusterSecurityGroupIngressProps,
  initializer: CfnClusterSecurityGroupIngress.() -> Unit = {},
): CfnClusterSecurityGroupIngress = CfnClusterSecurityGroupIngress(this, id,
    props).apply(initializer)
