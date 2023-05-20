@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInterface
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps
import software.constructs.Construct

public fun Construct.cfnNetworkInterface(
  id: String,
  props: CfnNetworkInterfaceProps,
  initializer: CfnNetworkInterface.() -> Unit = {},
): CfnNetworkInterface = CfnNetworkInterface(this, id, props).apply(initializer)
