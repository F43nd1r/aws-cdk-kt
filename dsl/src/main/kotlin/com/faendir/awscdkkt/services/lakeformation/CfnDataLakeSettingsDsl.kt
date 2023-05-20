@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lakeformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps
import software.constructs.Construct

public fun Construct.cfnDataLakeSettings(
  id: String,
  props: CfnDataLakeSettingsProps,
  initializer: CfnDataLakeSettings.() -> Unit = {},
): CfnDataLakeSettings = CfnDataLakeSettings(this, id, props).apply(initializer)

public fun Construct.cfnDataLakeSettings(id: String, initializer: CfnDataLakeSettings.() -> Unit =
    {}): CfnDataLakeSettings = CfnDataLakeSettings(this, id).apply(initializer)
