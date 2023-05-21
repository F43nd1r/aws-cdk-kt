package com.faendir.awscdkkt.services.workspaces

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
  initializer: CfnWorkspace.() -> Unit = {},
): CfnWorkspace = CfnWorkspace(this, id, props).apply(initializer)
