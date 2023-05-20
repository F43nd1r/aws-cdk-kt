@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

public
    fun sendingOptionsProperty(initializer: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit):
    CfnConfigurationSet.SendingOptionsProperty =
    CfnConfigurationSet.SendingOptionsProperty.builder().apply(initializer).build()
