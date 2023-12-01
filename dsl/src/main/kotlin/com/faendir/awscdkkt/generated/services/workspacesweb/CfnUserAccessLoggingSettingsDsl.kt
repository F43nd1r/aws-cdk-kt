package com.faendir.awscdkkt.generated.services.workspacesweb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings
import software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettingsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserAccessLoggingSettings(
  id: String,
  props: CfnUserAccessLoggingSettingsProps,
  initializer: @AwsCdkDsl CfnUserAccessLoggingSettings.() -> Unit = {},
): CfnUserAccessLoggingSettings = CfnUserAccessLoggingSettings(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserAccessLoggingSettings(id: String, initializer: @AwsCdkDsl
    CfnUserAccessLoggingSettings.Builder.() -> Unit = {}): CfnUserAccessLoggingSettings =
    CfnUserAccessLoggingSettings.Builder.create(this, id).apply(initializer).build()
