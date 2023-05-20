@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.chatbot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.SlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps
import software.constructs.Construct

public fun Construct.slackChannelConfiguration(
  id: String,
  props: SlackChannelConfigurationProps,
  initializer: SlackChannelConfiguration.() -> Unit = {},
): SlackChannelConfiguration = SlackChannelConfiguration(this, id, props).apply(initializer)
