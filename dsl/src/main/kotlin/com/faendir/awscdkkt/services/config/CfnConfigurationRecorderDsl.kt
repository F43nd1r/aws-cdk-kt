package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.amazon.awscdk.services.config.CfnConfigurationRecorderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationRecorder(
  id: String,
  props: CfnConfigurationRecorderProps,
  initializer: CfnConfigurationRecorder.() -> Unit = {},
): CfnConfigurationRecorder = CfnConfigurationRecorder(this, id, props).apply(initializer)
