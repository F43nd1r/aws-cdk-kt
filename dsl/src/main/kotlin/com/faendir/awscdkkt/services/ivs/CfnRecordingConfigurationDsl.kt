@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
