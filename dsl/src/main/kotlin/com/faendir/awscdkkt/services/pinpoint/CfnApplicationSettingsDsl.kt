@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
