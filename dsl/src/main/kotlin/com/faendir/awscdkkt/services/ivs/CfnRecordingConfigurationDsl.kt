@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ivs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import software.amazon.awscdk.services.ivs.CfnRecordingConfigurationProps
import software.constructs.Construct

public fun Construct.cfnRecordingConfiguration(
  id: String,
  props: CfnRecordingConfigurationProps,
  initializer: CfnRecordingConfiguration.() -> Unit = {},
): CfnRecordingConfiguration = CfnRecordingConfiguration(this, id, props).apply(initializer)
