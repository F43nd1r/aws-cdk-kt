@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
