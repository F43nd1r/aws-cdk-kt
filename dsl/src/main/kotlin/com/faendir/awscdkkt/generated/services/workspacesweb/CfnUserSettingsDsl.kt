package com.faendir.awscdkkt.generated.services.workspacesweb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnUserSettings
import software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserSettings(
  id: String,
  props: CfnUserSettingsProps,
  initializer: @AwsCdkDsl CfnUserSettings.() -> Unit = {},
): CfnUserSettings = CfnUserSettings(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserSettings(id: String, initializer: @AwsCdkDsl CfnUserSettings.Builder.() -> Unit = {}): CfnUserSettings = CfnUserSettings.Builder.create(this, id).apply(initializer).build()
