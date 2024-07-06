package com.faendir.awscdkkt.generated.services.workspaces

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspaces.CfnWorkspacesPool
import software.amazon.awscdk.services.workspaces.CfnWorkspacesPoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkspacesPool(
  id: String,
  props: CfnWorkspacesPoolProps,
  initializer: @AwsCdkDsl CfnWorkspacesPool.() -> Unit = {},
): CfnWorkspacesPool = CfnWorkspacesPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkspacesPool(id: String, initializer: @AwsCdkDsl
    CfnWorkspacesPool.Builder.() -> Unit = {}): CfnWorkspacesPool =
    CfnWorkspacesPool.Builder.create(this, id).apply(initializer).build()
