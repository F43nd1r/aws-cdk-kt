package com.faendir.awscdkkt.services.mediaconnect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowOutput(
  id: String,
  props: CfnFlowOutputProps,
  initializer: CfnFlowOutput.() -> Unit = {},
): CfnFlowOutput = CfnFlowOutput(this, id, props).apply(initializer)
