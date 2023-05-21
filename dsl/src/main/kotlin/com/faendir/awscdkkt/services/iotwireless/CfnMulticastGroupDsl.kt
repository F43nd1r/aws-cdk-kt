package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMulticastGroup(
  id: String,
  props: CfnMulticastGroupProps,
  initializer: CfnMulticastGroup.() -> Unit = {},
): CfnMulticastGroup = CfnMulticastGroup(this, id, props).apply(initializer)
