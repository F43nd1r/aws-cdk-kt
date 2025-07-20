package com.faendir.awscdkkt.generated.services.chatbot

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnMicrosoftTeamsChannelConfiguration.() -> Unit = {},
): CfnMicrosoftTeamsChannelConfiguration = CfnMicrosoftTeamsChannelConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMicrosoftTeamsChannelConfiguration(id: String, initializer: @AwsCdkDsl CfnMicrosoftTeamsChannelConfiguration.Builder.() -> Unit = {}): CfnMicrosoftTeamsChannelConfiguration = CfnMicrosoftTeamsChannelConfiguration.Builder.create(this, id).apply(initializer).build()
