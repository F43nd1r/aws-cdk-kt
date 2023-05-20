@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lookoutequipment

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

public
    fun s3OutputConfigurationProperty(initializer: CfnInferenceScheduler.S3OutputConfigurationProperty.Builder.() -> Unit):
    CfnInferenceScheduler.S3OutputConfigurationProperty =
    CfnInferenceScheduler.S3OutputConfigurationProperty.builder().apply(initializer).build()
