package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTaskDefinition(
  id: String,
  props: CfnTaskDefinitionProps,
  initializer: CfnTaskDefinition.() -> Unit = {},
): CfnTaskDefinition = CfnTaskDefinition(this, id, props).apply(initializer)
