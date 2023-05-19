@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.CfnListener
import software.amazon.awscdk.services.globalaccelerator.CfnListenerProps
import software.constructs.Construct

public fun Construct.cfnListener(
  id: String,
  props: CfnListenerProps,
  initializer: CfnListener.() -> Unit = {},
): CfnListener = CfnListener(this, id, props).apply(initializer)
