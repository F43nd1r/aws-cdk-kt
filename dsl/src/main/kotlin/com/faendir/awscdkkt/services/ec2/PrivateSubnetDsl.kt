@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PrivateSubnet
import software.amazon.awscdk.services.ec2.PrivateSubnetProps
import software.constructs.Construct

public fun Construct.privateSubnet(
  id: String,
  props: PrivateSubnetProps,
  initializer: PrivateSubnet.() -> Unit = {},
): PrivateSubnet = PrivateSubnet(this, id, props).apply(initializer)
