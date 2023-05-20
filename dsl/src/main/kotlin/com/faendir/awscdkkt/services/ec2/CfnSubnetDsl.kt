@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSubnet
import software.amazon.awscdk.services.ec2.CfnSubnetProps
import software.constructs.Construct

public fun Construct.cfnSubnet(
  id: String,
  props: CfnSubnetProps,
  initializer: CfnSubnet.() -> Unit = {},
): CfnSubnet = CfnSubnet(this, id, props).apply(initializer)
