@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
