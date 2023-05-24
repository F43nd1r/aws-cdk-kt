package com.faendir.awscdkkt.generated.services.mediaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface
import software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowVpcInterface(id: String, props: CfnFlowVpcInterfaceProps):
    CfnFlowVpcInterface = CfnFlowVpcInterface(this, id, props)

@Generated
public fun Construct.cfnFlowVpcInterface(
  id: String,
  props: CfnFlowVpcInterfaceProps,
  initializer: @AwsCdkDsl CfnFlowVpcInterface.() -> Unit,
): CfnFlowVpcInterface = CfnFlowVpcInterface(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFlowVpcInterface(id: String, initializer: @AwsCdkDsl
    CfnFlowVpcInterface.Builder.() -> Unit): CfnFlowVpcInterface =
    CfnFlowVpcInterface.Builder.create(this, id).apply(initializer).build()
