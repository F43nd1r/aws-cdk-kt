package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

@Generated
public
    fun sendingOptionsProperty(initializer: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit
    = {}): CfnConfigurationSet.SendingOptionsProperty =
    CfnConfigurationSet.SendingOptionsProperty.builder().apply(initializer).build()
