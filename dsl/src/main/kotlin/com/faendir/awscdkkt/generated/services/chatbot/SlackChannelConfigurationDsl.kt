package com.faendir.awscdkkt.generated.services.chatbot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.SlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.slackChannelConfiguration(id: String, props: SlackChannelConfigurationProps):
    SlackChannelConfiguration = SlackChannelConfiguration(this, id, props)

@Generated
public fun Construct.slackChannelConfiguration(
  id: String,
  props: SlackChannelConfigurationProps,
  initializer: @AwsCdkDsl SlackChannelConfiguration.() -> Unit,
): SlackChannelConfiguration = SlackChannelConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSlackChannelConfiguration(id: String, initializer: @AwsCdkDsl
    SlackChannelConfiguration.Builder.() -> Unit): SlackChannelConfiguration =
    SlackChannelConfiguration.Builder.create(this, id).apply(initializer).build()
