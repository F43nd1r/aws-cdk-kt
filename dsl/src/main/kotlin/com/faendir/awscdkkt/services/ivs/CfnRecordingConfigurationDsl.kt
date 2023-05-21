package com.faendir.awscdkkt.services.ivs

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
  initializer: CfnRecordingConfiguration.() -> Unit = {},
): CfnRecordingConfiguration = CfnRecordingConfiguration(this, id, props).apply(initializer)
