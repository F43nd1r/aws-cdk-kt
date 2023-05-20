@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnDestination
import software.amazon.awscdk.services.iotwireless.CfnDestinationProps
import software.constructs.Construct

public fun Construct.cfnDestination(
  id: String,
  props: CfnDestinationProps,
  initializer: CfnDestination.() -> Unit = {},
): CfnDestination = CfnDestination(this, id, props).apply(initializer)
