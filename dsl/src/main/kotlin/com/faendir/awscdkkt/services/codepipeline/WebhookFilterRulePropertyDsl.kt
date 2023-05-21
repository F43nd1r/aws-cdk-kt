package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnWebhook

@Generated
public
    fun webhookFilterRuleProperty(initializer: CfnWebhook.WebhookFilterRuleProperty.Builder.() -> Unit
    = {}): CfnWebhook.WebhookFilterRuleProperty =
    CfnWebhook.WebhookFilterRuleProperty.builder().apply(initializer).build()
