package com.faendir.awscdkkt.generated.services.workspacesweb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnPortal
import software.amazon.awscdk.services.workspacesweb.CfnPortalProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPortal(id: String, initializer: @AwsCdkDsl CfnPortal.() -> Unit = {}): CfnPortal = CfnPortal(this, id).apply(initializer)

@Generated
public fun Construct.cfnPortal(
  id: String,
  props: CfnPortalProps,
  initializer: @AwsCdkDsl CfnPortal.() -> Unit = {},
): CfnPortal = CfnPortal(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPortal(id: String, initializer: @AwsCdkDsl CfnPortal.Builder.() -> Unit = {}): CfnPortal = CfnPortal.Builder.create(this, id).apply(initializer).build()
