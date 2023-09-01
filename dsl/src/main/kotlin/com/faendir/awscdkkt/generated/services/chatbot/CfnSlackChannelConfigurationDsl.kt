package com.faendir.awscdkkt.generated.services.chatbot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration
import software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSlackChannelConfiguration(
  id: String,
  props: CfnSlackChannelConfigurationProps,
  initializer: @AwsCdkDsl CfnSlackChannelConfiguration.() -> Unit = {},
): CfnSlackChannelConfiguration = CfnSlackChannelConfiguration(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSlackChannelConfiguration(id: String, initializer: @AwsCdkDsl
    CfnSlackChannelConfiguration.Builder.() -> Unit = {}): CfnSlackChannelConfiguration =
    CfnSlackChannelConfiguration.Builder.create(this, id).apply(initializer).build()
