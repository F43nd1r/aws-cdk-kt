package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnRule

@Generated
public
    fun sendNotificationActionProperty(initializer: CfnRule.SendNotificationActionProperty.Builder.() -> Unit
    = {}): CfnRule.SendNotificationActionProperty =
    CfnRule.SendNotificationActionProperty.builder().apply(initializer).build()
