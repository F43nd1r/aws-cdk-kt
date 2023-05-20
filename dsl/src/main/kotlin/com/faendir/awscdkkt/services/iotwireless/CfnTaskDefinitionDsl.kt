@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps
import software.constructs.Construct

public fun Construct.cfnTaskDefinition(
  id: String,
  props: CfnTaskDefinitionProps,
  initializer: CfnTaskDefinition.() -> Unit = {},
): CfnTaskDefinition = CfnTaskDefinition(this, id, props).apply(initializer)
