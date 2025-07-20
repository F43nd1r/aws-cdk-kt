package com.faendir.awscdkkt.generated.services.omics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnWorkflowVersion
import software.amazon.awscdk.services.omics.CfnWorkflowVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkflowVersion(
  id: String,
  props: CfnWorkflowVersionProps,
  initializer: @AwsCdkDsl CfnWorkflowVersion.() -> Unit = {},
): CfnWorkflowVersion = CfnWorkflowVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkflowVersion(id: String, initializer: @AwsCdkDsl CfnWorkflowVersion.Builder.() -> Unit = {}): CfnWorkflowVersion = CfnWorkflowVersion.Builder.create(this, id).apply(initializer).build()
