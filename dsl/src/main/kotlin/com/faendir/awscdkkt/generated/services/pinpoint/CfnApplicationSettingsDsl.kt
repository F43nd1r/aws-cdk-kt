package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationSettings(
  id: String,
  props: CfnApplicationSettingsProps,
  initializer: @AwsCdkDsl CfnApplicationSettings.() -> Unit = {},
): CfnApplicationSettings = CfnApplicationSettings(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationSettings(id: String, initializer: @AwsCdkDsl
    CfnApplicationSettings.Builder.() -> Unit = {}): CfnApplicationSettings =
    CfnApplicationSettings.Builder.create(this, id).apply(initializer).build()
