package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnContactFlowModule
import software.amazon.awscdk.services.connect.CfnContactFlowModuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContactFlowModule(
  id: String,
  props: CfnContactFlowModuleProps,
  initializer: CfnContactFlowModule.() -> Unit = {},
): CfnContactFlowModule = CfnContactFlowModule(this, id, props).apply(initializer)
