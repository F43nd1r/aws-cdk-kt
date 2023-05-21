package com.faendir.awscdkkt.services.lookoutequipment

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

@Generated
public
    fun s3OutputConfigurationProperty(initializer: CfnInferenceScheduler.S3OutputConfigurationProperty.Builder.() -> Unit
    = {}): CfnInferenceScheduler.S3OutputConfigurationProperty =
    CfnInferenceScheduler.S3OutputConfigurationProperty.builder().apply(initializer).build()
