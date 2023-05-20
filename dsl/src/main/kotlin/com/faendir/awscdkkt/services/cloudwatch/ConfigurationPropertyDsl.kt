@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

public
    fun configurationProperty(initializer: CfnAnomalyDetector.ConfigurationProperty.Builder.() -> Unit):
    CfnAnomalyDetector.ConfigurationProperty =
    CfnAnomalyDetector.ConfigurationProperty.builder().apply(initializer).build()
