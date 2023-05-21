package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun metricsProperty(initializer: CfnBucket.MetricsProperty.Builder.() -> Unit = {}):
    CfnBucket.MetricsProperty = CfnBucket.MetricsProperty.builder().apply(initializer).build()
