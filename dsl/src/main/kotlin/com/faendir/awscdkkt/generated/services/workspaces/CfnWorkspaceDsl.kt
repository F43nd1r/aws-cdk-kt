package com.faendir.awscdkkt.generated.services.workspaces

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspaces.CfnWorkspace
import software.amazon.awscdk.services.workspaces.CfnWorkspaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkspace(
  id: String,
  props: CfnWorkspaceProps,
  initializer: @AwsCdkDsl CfnWorkspace.() -> Unit = {},
): CfnWorkspace = CfnWorkspace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkspace(id: String, initializer: @AwsCdkDsl
    CfnWorkspace.Builder.() -> Unit = {}): CfnWorkspace = CfnWorkspace.Builder.create(this,
    id).apply(initializer).build()
