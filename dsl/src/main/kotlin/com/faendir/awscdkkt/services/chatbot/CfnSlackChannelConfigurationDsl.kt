@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.chatbot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps
import software.constructs.Construct

public fun Construct.cfnSlackChannelConfiguration(
  id: String,
  props: CfnSlackChannelConfigurationProps,
  initializer: CfnSlackChannelConfiguration.() -> Unit = {},
): CfnSlackChannelConfiguration = CfnSlackChannelConfiguration(this, id, props).apply(initializer)
