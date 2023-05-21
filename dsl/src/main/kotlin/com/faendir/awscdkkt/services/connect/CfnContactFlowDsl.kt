package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnContactFlow
import software.amazon.awscdk.services.connect.CfnContactFlowProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContactFlow(
  id: String,
  props: CfnContactFlowProps,
  initializer: CfnContactFlow.() -> Unit = {},
): CfnContactFlow = CfnContactFlow(this, id, props).apply(initializer)
