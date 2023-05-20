@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkAcl
import software.amazon.awscdk.services.ec2.CfnNetworkAclProps
import software.constructs.Construct

public fun Construct.cfnNetworkAcl(
  id: String,
  props: CfnNetworkAclProps,
  initializer: CfnNetworkAcl.() -> Unit = {},
): CfnNetworkAcl = CfnNetworkAcl(this, id, props).apply(initializer)
