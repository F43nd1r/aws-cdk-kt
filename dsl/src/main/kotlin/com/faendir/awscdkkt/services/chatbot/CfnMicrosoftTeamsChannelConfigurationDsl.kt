package com.faendir.awscdkkt.services.chatbot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration
import software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMicrosoftTeamsChannelConfiguration(
  id: String,
  props: CfnMicrosoftTeamsChannelConfigurationProps,
  initializer: CfnMicrosoftTeamsChannelConfiguration.() -> Unit = {},
): CfnMicrosoftTeamsChannelConfiguration = CfnMicrosoftTeamsChannelConfiguration(this, id,
    props).apply(initializer)
