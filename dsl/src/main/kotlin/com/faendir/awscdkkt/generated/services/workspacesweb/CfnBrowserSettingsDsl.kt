package com.faendir.awscdkkt.generated.services.workspacesweb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings
import software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBrowserSettings(id: String, initializer: @AwsCdkDsl CfnBrowserSettings.() -> Unit = {}): CfnBrowserSettings = CfnBrowserSettings(this, id).apply(initializer)

@Generated
public fun Construct.cfnBrowserSettings(
  id: String,
  props: CfnBrowserSettingsProps,
  initializer: @AwsCdkDsl CfnBrowserSettings.() -> Unit = {},
): CfnBrowserSettings = CfnBrowserSettings(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBrowserSettings(id: String, initializer: @AwsCdkDsl CfnBrowserSettings.Builder.() -> Unit = {}): CfnBrowserSettings = CfnBrowserSettings.Builder.create(this, id).apply(initializer).build()
