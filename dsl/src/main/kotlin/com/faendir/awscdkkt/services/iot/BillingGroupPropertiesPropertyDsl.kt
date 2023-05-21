package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnBillingGroup

@Generated
public
    fun billingGroupPropertiesProperty(initializer: CfnBillingGroup.BillingGroupPropertiesProperty.Builder.() -> Unit
    = {}): CfnBillingGroup.BillingGroupPropertiesProperty =
    CfnBillingGroup.BillingGroupPropertiesProperty.builder().apply(initializer).build()
