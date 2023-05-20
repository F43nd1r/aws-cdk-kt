@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.oam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.oam.CfnSink
import software.amazon.awscdk.services.oam.CfnSinkProps
import software.constructs.Construct

public fun Construct.cfnSink(
  id: String,
  props: CfnSinkProps,
  initializer: CfnSink.() -> Unit = {},
): CfnSink = CfnSink(this, id, props).apply(initializer)
