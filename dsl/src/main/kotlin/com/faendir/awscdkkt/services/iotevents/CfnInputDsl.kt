@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iotevents

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnInput
import software.amazon.awscdk.services.iotevents.CfnInputProps
import software.constructs.Construct

public fun Construct.cfnInput(
  id: String,
  props: CfnInputProps,
  initializer: CfnInput.() -> Unit = {},
): CfnInput = CfnInput(this, id, props).apply(initializer)
