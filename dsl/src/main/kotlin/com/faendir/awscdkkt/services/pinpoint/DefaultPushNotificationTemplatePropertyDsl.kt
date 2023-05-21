package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate

@Generated
public
    fun defaultPushNotificationTemplateProperty(initializer: CfnPushTemplate.DefaultPushNotificationTemplateProperty.Builder.() -> Unit
    = {}): CfnPushTemplate.DefaultPushNotificationTemplateProperty =
    CfnPushTemplate.DefaultPushNotificationTemplateProperty.builder().apply(initializer).build()
