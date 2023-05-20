@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe
import software.amazon.awscdk.services.pipes.CfnPipeProps
import software.constructs.Construct

public fun Construct.cfnPipe(
  id: String,
  props: CfnPipeProps,
  initializer: CfnPipe.() -> Unit = {},
): CfnPipe = CfnPipe(this, id, props).apply(initializer)
