@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
