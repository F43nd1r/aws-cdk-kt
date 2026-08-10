package com.faendir.awscdkkt.generated.services.imagebuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnAllWorkflowBuildVersions
import software.amazon.awscdk.services.imagebuilder.CfnAllWorkflowBuildVersionsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAllWorkflowBuildVersions(id: String, initializer: @AwsCdkDsl CfnAllWorkflowBuildVersions.() -> Unit = {}): CfnAllWorkflowBuildVersions = CfnAllWorkflowBuildVersions(this, id).apply(initializer)

@Generated
public fun Construct.cfnAllWorkflowBuildVersions(
  id: String,
  props: CfnAllWorkflowBuildVersionsProps,
  initializer: @AwsCdkDsl CfnAllWorkflowBuildVersions.() -> Unit = {},
): CfnAllWorkflowBuildVersions = CfnAllWorkflowBuildVersions(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAllWorkflowBuildVersions(id: String, initializer: @AwsCdkDsl CfnAllWorkflowBuildVersions.Builder.() -> Unit = {}): CfnAllWorkflowBuildVersions = CfnAllWorkflowBuildVersions.Builder.create(this, id).apply(initializer).build()
