@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnJob

public
    fun validationConfigurationProperty(initializer: CfnJob.ValidationConfigurationProperty.Builder.() -> Unit):
    CfnJob.ValidationConfigurationProperty =
    CfnJob.ValidationConfigurationProperty.builder().apply(initializer).build()
