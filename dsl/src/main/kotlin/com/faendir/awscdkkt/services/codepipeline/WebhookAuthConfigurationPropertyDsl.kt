package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnWebhook

@Generated
public
    fun webhookAuthConfigurationProperty(initializer: CfnWebhook.WebhookAuthConfigurationProperty.Builder.() -> Unit
    = {}): CfnWebhook.WebhookAuthConfigurationProperty =
    CfnWebhook.WebhookAuthConfigurationProperty.builder().apply(initializer).build()
