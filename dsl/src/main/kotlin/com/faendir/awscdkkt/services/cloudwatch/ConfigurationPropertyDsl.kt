@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

public
    fun configurationProperty(initializer: CfnAnomalyDetector.ConfigurationProperty.Builder.() -> Unit):
    CfnAnomalyDetector.ConfigurationProperty =
    CfnAnomalyDetector.ConfigurationProperty.builder().apply(initializer).build()
