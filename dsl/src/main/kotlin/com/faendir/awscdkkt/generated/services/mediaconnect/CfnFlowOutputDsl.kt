package com.faendir.awscdkkt.generated.services.mediaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowOutput(id: String, props: CfnFlowOutputProps): CfnFlowOutput =
    CfnFlowOutput(this, id, props)

@Generated
public fun Construct.cfnFlowOutput(
  id: String,
  props: CfnFlowOutputProps,
  initializer: @AwsCdkDsl CfnFlowOutput.() -> Unit,
): CfnFlowOutput = CfnFlowOutput(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFlowOutput(id: String, initializer: @AwsCdkDsl
    CfnFlowOutput.Builder.() -> Unit): CfnFlowOutput = CfnFlowOutput.Builder.create(this,
    id).apply(initializer).build()
