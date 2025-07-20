package com.faendir.awscdkkt.generated.services.workspacesweb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettings
import software.amazon.awscdk.services.workspacesweb.CfnDataProtectionSettingsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataProtectionSettings(id: String, initializer: @AwsCdkDsl CfnDataProtectionSettings.() -> Unit = {}): CfnDataProtectionSettings = CfnDataProtectionSettings(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataProtectionSettings(
  id: String,
  props: CfnDataProtectionSettingsProps,
  initializer: @AwsCdkDsl CfnDataProtectionSettings.() -> Unit = {},
): CfnDataProtectionSettings = CfnDataProtectionSettings(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataProtectionSettings(id: String, initializer: @AwsCdkDsl CfnDataProtectionSettings.Builder.() -> Unit = {}): CfnDataProtectionSettings = CfnDataProtectionSettings.Builder.create(this, id).apply(initializer).build()
