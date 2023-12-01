package com.faendir.awscdkkt.generated.services.workspacesweb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings
import software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIpAccessSettings(
  id: String,
  props: CfnIpAccessSettingsProps,
  initializer: @AwsCdkDsl CfnIpAccessSettings.() -> Unit = {},
): CfnIpAccessSettings = CfnIpAccessSettings(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIpAccessSettings(id: String, initializer: @AwsCdkDsl
    CfnIpAccessSettings.Builder.() -> Unit = {}): CfnIpAccessSettings =
    CfnIpAccessSettings.Builder.create(this, id).apply(initializer).build()
