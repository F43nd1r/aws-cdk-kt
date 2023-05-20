@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEventBusPolicy
import software.amazon.awscdk.services.events.CfnEventBusPolicyProps
import software.constructs.Construct

public fun Construct.cfnEventBusPolicy(
  id: String,
  props: CfnEventBusPolicyProps,
  initializer: CfnEventBusPolicy.() -> Unit = {},
): CfnEventBusPolicy = CfnEventBusPolicy(this, id, props).apply(initializer)
