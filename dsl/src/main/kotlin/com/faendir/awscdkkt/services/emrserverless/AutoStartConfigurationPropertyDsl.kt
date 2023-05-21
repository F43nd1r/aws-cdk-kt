package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

@Generated
public
    fun autoStartConfigurationProperty(initializer: CfnApplication.AutoStartConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.AutoStartConfigurationProperty =
    CfnApplication.AutoStartConfigurationProperty.builder().apply(initializer).build()
