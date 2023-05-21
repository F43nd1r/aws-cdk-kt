package com.faendir.awscdkkt.services.oam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.oam.CfnSink
import software.amazon.awscdk.services.oam.CfnSinkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSink(
  id: String,
  props: CfnSinkProps,
  initializer: CfnSink.() -> Unit = {},
): CfnSink = CfnSink(this, id, props).apply(initializer)
