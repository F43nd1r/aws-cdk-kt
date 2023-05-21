package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnInput
import software.amazon.awscdk.services.iotevents.CfnInputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInput(
  id: String,
  props: CfnInputProps,
  initializer: CfnInput.() -> Unit = {},
): CfnInput = CfnInput(this, id, props).apply(initializer)
