package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate

@Generated
public
    fun androidPushNotificationTemplateProperty(initializer: CfnPushTemplate.AndroidPushNotificationTemplateProperty.Builder.() -> Unit
    = {}): CfnPushTemplate.AndroidPushNotificationTemplateProperty =
    CfnPushTemplate.AndroidPushNotificationTemplateProperty.builder().apply(initializer).build()
