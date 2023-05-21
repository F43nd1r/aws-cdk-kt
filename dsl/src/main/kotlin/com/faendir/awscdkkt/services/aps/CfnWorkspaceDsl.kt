package com.faendir.awscdkkt.services.aps

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.aps.CfnWorkspace
import software.amazon.awscdk.services.aps.CfnWorkspaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkspace(id: String, initializer: CfnWorkspace.() -> Unit = {}):
    CfnWorkspace = CfnWorkspace(this, id).apply(initializer)

@Generated
public fun Construct.cfnWorkspace(
  id: String,
  props: CfnWorkspaceProps,
  initializer: CfnWorkspace.() -> Unit = {},
): CfnWorkspace = CfnWorkspace(this, id, props).apply(initializer)
