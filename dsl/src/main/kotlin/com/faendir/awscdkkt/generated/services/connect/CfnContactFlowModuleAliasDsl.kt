package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnContactFlowModuleAlias
import software.amazon.awscdk.services.connect.CfnContactFlowModuleAliasProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContactFlowModuleAlias(
  id: String,
  props: CfnContactFlowModuleAliasProps,
  initializer: @AwsCdkDsl CfnContactFlowModuleAlias.() -> Unit = {},
): CfnContactFlowModuleAlias = CfnContactFlowModuleAlias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContactFlowModuleAlias(id: String, initializer: @AwsCdkDsl CfnContactFlowModuleAlias.Builder.() -> Unit = {}): CfnContactFlowModuleAlias = CfnContactFlowModuleAlias.Builder.create(this, id).apply(initializer).build()
