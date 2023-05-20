@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.mediatailor

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps
import software.constructs.Construct

public fun Construct.cfnPlaybackConfiguration(
  id: String,
  props: CfnPlaybackConfigurationProps,
  initializer: CfnPlaybackConfiguration.() -> Unit = {},
): CfnPlaybackConfiguration = CfnPlaybackConfiguration(this, id, props).apply(initializer)
