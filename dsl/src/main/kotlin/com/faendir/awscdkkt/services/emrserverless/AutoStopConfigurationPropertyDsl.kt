package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

@Generated
public
    fun autoStopConfigurationProperty(initializer: CfnApplication.AutoStopConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.AutoStopConfigurationProperty =
    CfnApplication.AutoStopConfigurationProperty.builder().apply(initializer).build()
