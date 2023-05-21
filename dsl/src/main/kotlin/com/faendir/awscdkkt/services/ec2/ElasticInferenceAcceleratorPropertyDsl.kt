package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInstance

@Generated
public
    fun elasticInferenceAcceleratorProperty(initializer: CfnInstance.ElasticInferenceAcceleratorProperty.Builder.() -> Unit
    = {}): CfnInstance.ElasticInferenceAcceleratorProperty =
    CfnInstance.ElasticInferenceAcceleratorProperty.builder().apply(initializer).build()
