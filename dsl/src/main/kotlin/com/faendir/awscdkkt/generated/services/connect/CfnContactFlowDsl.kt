package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnContactFlow
import software.amazon.awscdk.services.connect.CfnContactFlowProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContactFlow(id: String, props: CfnContactFlowProps): CfnContactFlow =
    CfnContactFlow(this, id, props)

@Generated
public fun Construct.cfnContactFlow(
  id: String,
  props: CfnContactFlowProps,
  initializer: @AwsCdkDsl CfnContactFlow.() -> Unit,
): CfnContactFlow = CfnContactFlow(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContactFlow(id: String, initializer: @AwsCdkDsl
    CfnContactFlow.Builder.() -> Unit): CfnContactFlow = CfnContactFlow.Builder.create(this,
    id).apply(initializer).build()
