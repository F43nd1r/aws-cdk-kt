package com.faendir.awscdkkt.services.mediaconnect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowVpcInterface(
  id: String,
  props: CfnFlowVpcInterfaceProps,
  initializer: CfnFlowVpcInterface.() -> Unit = {},
): CfnFlowVpcInterface = CfnFlowVpcInterface(this, id, props).apply(initializer)
