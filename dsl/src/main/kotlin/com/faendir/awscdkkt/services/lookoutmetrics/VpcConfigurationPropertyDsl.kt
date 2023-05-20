@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lookoutmetrics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

public
    fun vpcConfigurationProperty(initializer: CfnAnomalyDetector.VpcConfigurationProperty.Builder.() -> Unit):
    CfnAnomalyDetector.VpcConfigurationProperty =
    CfnAnomalyDetector.VpcConfigurationProperty.builder().apply(initializer).build()
