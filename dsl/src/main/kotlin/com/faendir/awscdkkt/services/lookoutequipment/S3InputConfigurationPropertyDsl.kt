package com.faendir.awscdkkt.services.lookoutequipment

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

@Generated
public
    fun s3InputConfigurationProperty(initializer: CfnInferenceScheduler.S3InputConfigurationProperty.Builder.() -> Unit
    = {}): CfnInferenceScheduler.S3InputConfigurationProperty =
    CfnInferenceScheduler.S3InputConfigurationProperty.builder().apply(initializer).build()
