package com.faendir.awscdkkt.services.lakeformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataLakeSettings(id: String, initializer: CfnDataLakeSettings.() -> Unit =
    {}): CfnDataLakeSettings = CfnDataLakeSettings(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataLakeSettings(
  id: String,
  props: CfnDataLakeSettingsProps,
  initializer: CfnDataLakeSettings.() -> Unit = {},
): CfnDataLakeSettings = CfnDataLakeSettings(this, id, props).apply(initializer)
