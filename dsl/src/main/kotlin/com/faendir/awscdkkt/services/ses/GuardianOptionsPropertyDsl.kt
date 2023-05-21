package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@Generated
public
    fun guardianOptionsProperty(initializer: CfnConfigurationSet.GuardianOptionsProperty.Builder.() -> Unit
    = {}): CfnConfigurationSet.GuardianOptionsProperty =
    CfnConfigurationSet.GuardianOptionsProperty.builder().apply(initializer).build()
