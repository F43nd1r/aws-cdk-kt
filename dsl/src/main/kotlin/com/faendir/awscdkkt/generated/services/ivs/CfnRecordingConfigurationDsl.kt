package com.faendir.awscdkkt.generated.services.ivs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRecordingConfiguration(
  id: String,
  props: CfnRecordingConfigurationProps,
  initializer: @AwsCdkDsl CfnRecordingConfiguration.() -> Unit = {},
): CfnRecordingConfiguration = CfnRecordingConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRecordingConfiguration(id: String, initializer: @AwsCdkDsl
    CfnRecordingConfiguration.Builder.() -> Unit = {}): CfnRecordingConfiguration =
    CfnRecordingConfiguration.Builder.create(this, id).apply(initializer).build()
