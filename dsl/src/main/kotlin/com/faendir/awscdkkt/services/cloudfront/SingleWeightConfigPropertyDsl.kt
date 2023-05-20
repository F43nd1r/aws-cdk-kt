@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

public
    fun singleWeightConfigProperty(initializer: CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.Builder.() -> Unit):
    CfnContinuousDeploymentPolicy.SingleWeightConfigProperty =
    CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.builder().apply(initializer).build()
