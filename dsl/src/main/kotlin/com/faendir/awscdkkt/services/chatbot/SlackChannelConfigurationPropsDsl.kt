package com.faendir.awscdkkt.services.chatbot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps

@Generated
public
    fun slackChannelConfigurationProps(initializer: SlackChannelConfigurationProps.Builder.() -> Unit
    = {}): SlackChannelConfigurationProps =
    SlackChannelConfigurationProps.builder().apply(initializer).build()
