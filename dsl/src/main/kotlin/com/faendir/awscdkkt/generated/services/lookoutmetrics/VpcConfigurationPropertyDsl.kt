package com.faendir.awscdkkt.generated.services.lookoutmetrics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@Generated
public fun buildVpcConfigurationProperty(initializer: @AwsCdkDsl
    CfnAnomalyDetector.VpcConfigurationProperty.Builder.() -> Unit = {}):
    CfnAnomalyDetector.VpcConfigurationProperty =
    CfnAnomalyDetector.VpcConfigurationProperty.Builder().apply(initializer).build()
