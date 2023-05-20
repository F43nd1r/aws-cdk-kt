@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.mediaconnect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps
import software.constructs.Construct

public fun Construct.cfnFlowVpcInterface(
  id: String,
  props: CfnFlowVpcInterfaceProps,
  initializer: CfnFlowVpcInterface.() -> Unit = {},
): CfnFlowVpcInterface = CfnFlowVpcInterface(this, id, props).apply(initializer)
