package com.faendir.awscdkkt.generated.services.bedrock

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bedrock.CfnFlow
import software.amazon.awscdk.services.bedrock.CfnFlowProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlow(
  id: String,
  props: CfnFlowProps,
  initializer: @AwsCdkDsl CfnFlow.() -> Unit = {},
): CfnFlow = CfnFlow(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFlow(id: String, initializer: @AwsCdkDsl CfnFlow.Builder.() -> Unit =
    {}): CfnFlow = CfnFlow.Builder.create(this, id).apply(initializer).build()
