package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinitionVersion

@Generated
public
    fun subscriptionProperty(initializer: CfnSubscriptionDefinitionVersion.SubscriptionProperty.Builder.() -> Unit
    = {}): CfnSubscriptionDefinitionVersion.SubscriptionProperty =
    CfnSubscriptionDefinitionVersion.SubscriptionProperty.builder().apply(initializer).build()
