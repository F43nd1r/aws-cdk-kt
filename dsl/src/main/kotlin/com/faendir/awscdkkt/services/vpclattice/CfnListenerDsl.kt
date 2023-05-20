@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnListener
import software.amazon.awscdk.services.vpclattice.CfnListenerProps
import software.constructs.Construct

public fun Construct.cfnListener(
  id: String,
  props: CfnListenerProps,
  initializer: CfnListener.() -> Unit = {},
): CfnListener = CfnListener(this, id, props).apply(initializer)
