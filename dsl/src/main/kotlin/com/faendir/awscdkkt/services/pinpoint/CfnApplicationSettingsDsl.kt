@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettingsProps
import software.constructs.Construct

public fun Construct.cfnApplicationSettings(
  id: String,
  props: CfnApplicationSettingsProps,
  initializer: CfnApplicationSettings.() -> Unit = {},
): CfnApplicationSettings = CfnApplicationSettings(this, id, props).apply(initializer)
