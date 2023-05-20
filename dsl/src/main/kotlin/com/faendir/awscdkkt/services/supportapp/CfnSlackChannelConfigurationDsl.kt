@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.supportapp

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration
import software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps
import software.constructs.Construct

public fun Construct.cfnSlackChannelConfiguration(
  id: String,
  props: CfnSlackChannelConfigurationProps,
  initializer: CfnSlackChannelConfiguration.() -> Unit = {},
): CfnSlackChannelConfiguration = CfnSlackChannelConfiguration(this, id, props).apply(initializer)
