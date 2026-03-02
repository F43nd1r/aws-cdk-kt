package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnContactFlowModuleVersion
import software.amazon.awscdk.services.connect.CfnContactFlowModuleVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContactFlowModuleVersion(
  id: String,
  props: CfnContactFlowModuleVersionProps,
  initializer: @AwsCdkDsl CfnContactFlowModuleVersion.() -> Unit = {},
): CfnContactFlowModuleVersion = CfnContactFlowModuleVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContactFlowModuleVersion(id: String, initializer: @AwsCdkDsl CfnContactFlowModuleVersion.Builder.() -> Unit = {}): CfnContactFlowModuleVersion = CfnContactFlowModuleVersion.Builder.create(this, id).apply(initializer).build()
