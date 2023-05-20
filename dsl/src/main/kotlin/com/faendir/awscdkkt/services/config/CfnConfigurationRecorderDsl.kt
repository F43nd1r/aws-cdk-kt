@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.amazon.awscdk.services.config.CfnConfigurationRecorderProps
import software.constructs.Construct

public fun Construct.cfnConfigurationRecorder(
  id: String,
  props: CfnConfigurationRecorderProps,
  initializer: CfnConfigurationRecorder.() -> Unit = {},
): CfnConfigurationRecorder = CfnConfigurationRecorder(this, id, props).apply(initializer)
