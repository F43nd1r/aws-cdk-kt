package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun metricsConfigurationProperty(initializer: CfnBucket.MetricsConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.MetricsConfigurationProperty =
    CfnBucket.MetricsConfigurationProperty.builder().apply(initializer).build()
