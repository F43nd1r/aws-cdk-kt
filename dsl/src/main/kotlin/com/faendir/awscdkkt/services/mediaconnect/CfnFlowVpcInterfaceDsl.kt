@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
