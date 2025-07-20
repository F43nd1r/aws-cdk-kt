package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnContactFlowVersion
import software.amazon.awscdk.services.connect.CfnContactFlowVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContactFlowVersion(
  id: String,
  props: CfnContactFlowVersionProps,
  initializer: @AwsCdkDsl CfnContactFlowVersion.() -> Unit = {},
): CfnContactFlowVersion = CfnContactFlowVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContactFlowVersion(id: String, initializer: @AwsCdkDsl CfnContactFlowVersion.Builder.() -> Unit = {}): CfnContactFlowVersion = CfnContactFlowVersion.Builder.create(this, id).apply(initializer).build()
