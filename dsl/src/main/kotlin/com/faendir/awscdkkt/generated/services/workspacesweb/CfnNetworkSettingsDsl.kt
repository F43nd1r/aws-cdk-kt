package com.faendir.awscdkkt.generated.services.workspacesweb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnNetworkSettings
import software.amazon.awscdk.services.workspacesweb.CfnNetworkSettingsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkSettings(
  id: String,
  props: CfnNetworkSettingsProps,
  initializer: @AwsCdkDsl CfnNetworkSettings.() -> Unit = {},
): CfnNetworkSettings = CfnNetworkSettings(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkSettings(id: String, initializer: @AwsCdkDsl
    CfnNetworkSettings.Builder.() -> Unit = {}): CfnNetworkSettings =
    CfnNetworkSettings.Builder.create(this, id).apply(initializer).build()
