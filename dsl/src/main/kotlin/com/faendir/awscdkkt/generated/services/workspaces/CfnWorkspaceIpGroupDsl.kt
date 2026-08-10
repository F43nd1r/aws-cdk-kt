package com.faendir.awscdkkt.generated.services.workspaces

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspaces.CfnWorkspaceIpGroup
import software.amazon.awscdk.services.workspaces.CfnWorkspaceIpGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkspaceIpGroup(
  id: String,
  props: CfnWorkspaceIpGroupProps,
  initializer: @AwsCdkDsl CfnWorkspaceIpGroup.() -> Unit = {},
): CfnWorkspaceIpGroup = CfnWorkspaceIpGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkspaceIpGroup(id: String, initializer: @AwsCdkDsl CfnWorkspaceIpGroup.Builder.() -> Unit = {}): CfnWorkspaceIpGroup = CfnWorkspaceIpGroup.Builder.create(this, id).apply(initializer).build()
