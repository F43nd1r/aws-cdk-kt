package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public fun webhookFilterProperty(initializer: CfnProject.WebhookFilterProperty.Builder.() -> Unit =
    {}): CfnProject.WebhookFilterProperty =
    CfnProject.WebhookFilterProperty.builder().apply(initializer).build()
