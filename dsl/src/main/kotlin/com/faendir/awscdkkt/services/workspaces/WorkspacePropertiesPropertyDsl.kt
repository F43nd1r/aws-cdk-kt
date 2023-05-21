package com.faendir.awscdkkt.services.workspaces

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.workspaces.CfnWorkspace

@Generated
public
    fun workspacePropertiesProperty(initializer: CfnWorkspace.WorkspacePropertiesProperty.Builder.() -> Unit
    = {}): CfnWorkspace.WorkspacePropertiesProperty =
    CfnWorkspace.WorkspacePropertiesProperty.builder().apply(initializer).build()
