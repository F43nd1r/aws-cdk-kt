package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnContactFlowModule.() -> Unit = {},
): CfnContactFlowModule = CfnContactFlowModule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContactFlowModule(id: String, initializer: @AwsCdkDsl
    CfnContactFlowModule.Builder.() -> Unit = {}): CfnContactFlowModule =
    CfnContactFlowModule.Builder.create(this, id).apply(initializer).build()
