package com.faendir.awscdkkt.services.ssmincidents

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@Generated
public
    fun notificationTargetItemProperty(initializer: CfnResponsePlan.NotificationTargetItemProperty.Builder.() -> Unit
    = {}): CfnResponsePlan.NotificationTargetItemProperty =
    CfnResponsePlan.NotificationTargetItemProperty.builder().apply(initializer).build()
