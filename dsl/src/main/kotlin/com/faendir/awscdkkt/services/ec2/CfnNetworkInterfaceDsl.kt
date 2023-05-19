@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
