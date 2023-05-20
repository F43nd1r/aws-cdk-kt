@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnWebhook

public
    fun webhookAuthConfigurationProperty(initializer: CfnWebhook.WebhookAuthConfigurationProperty.Builder.() -> Unit):
    CfnWebhook.WebhookAuthConfigurationProperty =
    CfnWebhook.WebhookAuthConfigurationProperty.builder().apply(initializer).build()
