package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.CfnAccount

@Generated
public
    fun expiryEventsConfigurationProperty(initializer: CfnAccount.ExpiryEventsConfigurationProperty.Builder.() -> Unit
    = {}): CfnAccount.ExpiryEventsConfigurationProperty =
    CfnAccount.ExpiryEventsConfigurationProperty.builder().apply(initializer).build()
