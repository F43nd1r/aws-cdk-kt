@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

public
    fun trafficConfigProperty(initializer: CfnContinuousDeploymentPolicy.TrafficConfigProperty.Builder.() -> Unit):
    CfnContinuousDeploymentPolicy.TrafficConfigProperty =
    CfnContinuousDeploymentPolicy.TrafficConfigProperty.builder().apply(initializer).build()
