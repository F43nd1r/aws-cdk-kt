@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emrserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emrserverless.CfnApplication

public
    fun workerConfigurationProperty(initializer: CfnApplication.WorkerConfigurationProperty.Builder.() -> Unit):
    CfnApplication.WorkerConfigurationProperty =
    CfnApplication.WorkerConfigurationProperty.builder().apply(initializer).build()
