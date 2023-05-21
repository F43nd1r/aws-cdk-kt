package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@Generated
public
    fun deliveryOptionsProperty(initializer: CfnConfigurationSet.DeliveryOptionsProperty.Builder.() -> Unit
    = {}): CfnConfigurationSet.DeliveryOptionsProperty =
    CfnConfigurationSet.DeliveryOptionsProperty.builder().apply(initializer).build()
