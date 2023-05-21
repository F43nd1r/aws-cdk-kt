package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@Generated
public
    fun sendingOptionsProperty(initializer: CfnConfigurationSet.SendingOptionsProperty.Builder.() -> Unit
    = {}): CfnConfigurationSet.SendingOptionsProperty =
    CfnConfigurationSet.SendingOptionsProperty.builder().apply(initializer).build()
