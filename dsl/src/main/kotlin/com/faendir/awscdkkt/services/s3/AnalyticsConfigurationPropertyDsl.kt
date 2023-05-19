@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

public
    fun analyticsConfigurationProperty(initializer: CfnBucket.AnalyticsConfigurationProperty.Builder.() -> Unit):
    CfnBucket.AnalyticsConfigurationProperty =
    CfnBucket.AnalyticsConfigurationProperty.builder().apply(initializer).build()
