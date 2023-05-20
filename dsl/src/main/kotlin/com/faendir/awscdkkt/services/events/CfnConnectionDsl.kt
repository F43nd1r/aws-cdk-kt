@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnConnection
import software.amazon.awscdk.services.events.CfnConnectionProps
import software.constructs.Construct

public fun Construct.cfnConnection(
  id: String,
  props: CfnConnectionProps,
  initializer: CfnConnection.() -> Unit = {},
): CfnConnection = CfnConnection(this, id, props).apply(initializer)
