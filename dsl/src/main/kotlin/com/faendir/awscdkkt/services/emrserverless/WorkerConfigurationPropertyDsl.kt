package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

@Generated
public
    fun workerConfigurationProperty(initializer: CfnApplication.WorkerConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.WorkerConfigurationProperty =
    CfnApplication.WorkerConfigurationProperty.builder().apply(initializer).build()
