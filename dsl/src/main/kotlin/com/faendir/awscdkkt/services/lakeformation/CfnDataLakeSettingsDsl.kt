@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lakeformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps
import software.constructs.Construct

public fun Construct.cfnDataLakeSettings(id: String, initializer: CfnDataLakeSettings.() -> Unit =
    {}): CfnDataLakeSettings = CfnDataLakeSettings(this, id).apply(initializer)

public fun Construct.cfnDataLakeSettings(
  id: String,
  props: CfnDataLakeSettingsProps,
  initializer: CfnDataLakeSettings.() -> Unit = {},
): CfnDataLakeSettings = CfnDataLakeSettings(this, id, props).apply(initializer)
