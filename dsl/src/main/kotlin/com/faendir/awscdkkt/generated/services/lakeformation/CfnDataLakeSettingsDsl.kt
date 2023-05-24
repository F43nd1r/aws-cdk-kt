package com.faendir.awscdkkt.generated.services.lakeformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettingsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataLakeSettings(id: String, props: CfnDataLakeSettingsProps):
    CfnDataLakeSettings = CfnDataLakeSettings(this, id, props)

@Generated
public fun Construct.cfnDataLakeSettings(
  id: String,
  props: CfnDataLakeSettingsProps,
  initializer: @AwsCdkDsl CfnDataLakeSettings.() -> Unit,
): CfnDataLakeSettings = CfnDataLakeSettings(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnDataLakeSettings(id: String): CfnDataLakeSettings =
    CfnDataLakeSettings(this, id)

@Generated
public fun Construct.cfnDataLakeSettings(id: String, initializer: @AwsCdkDsl
    CfnDataLakeSettings.() -> Unit): CfnDataLakeSettings = CfnDataLakeSettings(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnDataLakeSettings(id: String, initializer: @AwsCdkDsl
    CfnDataLakeSettings.Builder.() -> Unit): CfnDataLakeSettings =
    CfnDataLakeSettings.Builder.create(this, id).apply(initializer).build()
