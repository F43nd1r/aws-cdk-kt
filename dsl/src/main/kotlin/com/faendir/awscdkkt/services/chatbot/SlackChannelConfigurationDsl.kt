package com.faendir.awscdkkt.services.chatbot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.SlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.slackChannelConfiguration(
  id: String,
  props: SlackChannelConfigurationProps,
  initializer: SlackChannelConfiguration.() -> Unit = {},
): SlackChannelConfiguration = SlackChannelConfiguration(this, id, props).apply(initializer)
