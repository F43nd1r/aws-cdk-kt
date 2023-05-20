@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

public
    fun singleWeightConfigProperty(initializer: CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.Builder.() -> Unit):
    CfnContinuousDeploymentPolicy.SingleWeightConfigProperty =
    CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.builder().apply(initializer).build()
