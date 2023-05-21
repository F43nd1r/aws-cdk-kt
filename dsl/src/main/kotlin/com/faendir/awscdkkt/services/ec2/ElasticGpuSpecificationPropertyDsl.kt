package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun elasticGpuSpecificationProperty(initializer: CfnLaunchTemplate.ElasticGpuSpecificationProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.ElasticGpuSpecificationProperty =
    CfnLaunchTemplate.ElasticGpuSpecificationProperty.builder().apply(initializer).build()
