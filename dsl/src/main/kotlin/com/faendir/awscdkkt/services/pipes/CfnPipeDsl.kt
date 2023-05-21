package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe
import software.amazon.awscdk.services.pipes.CfnPipeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPipe(
  id: String,
  props: CfnPipeProps,
  initializer: CfnPipe.() -> Unit = {},
): CfnPipe = CfnPipe(this, id, props).apply(initializer)
