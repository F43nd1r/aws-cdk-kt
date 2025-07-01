package com.faendir.awscdkkt.generated.services.workspacesinstances

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstance
import software.amazon.awscdk.services.workspacesinstances.CfnWorkspaceInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkspaceInstance(id: String, initializer: @AwsCdkDsl
    CfnWorkspaceInstance.() -> Unit = {}): CfnWorkspaceInstance = CfnWorkspaceInstance(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnWorkspaceInstance(
  id: String,
  props: CfnWorkspaceInstanceProps,
  initializer: @AwsCdkDsl CfnWorkspaceInstance.() -> Unit = {},
): CfnWorkspaceInstance = CfnWorkspaceInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkspaceInstance(id: String, initializer: @AwsCdkDsl
    CfnWorkspaceInstance.Builder.() -> Unit = {}): CfnWorkspaceInstance =
    CfnWorkspaceInstance.Builder.create(this, id).apply(initializer).build()
