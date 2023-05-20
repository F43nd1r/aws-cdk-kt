@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps
import software.constructs.Construct

public fun Construct.cfnMulticastGroup(
  id: String,
  props: CfnMulticastGroupProps,
  initializer: CfnMulticastGroup.() -> Unit = {},
): CfnMulticastGroup = CfnMulticastGroup(this, id, props).apply(initializer)
