@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

public
    fun trafficConfigProperty(initializer: CfnContinuousDeploymentPolicy.TrafficConfigProperty.Builder.() -> Unit):
    CfnContinuousDeploymentPolicy.TrafficConfigProperty =
    CfnContinuousDeploymentPolicy.TrafficConfigProperty.builder().apply(initializer).build()
