package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

@Generated
public
    fun singleHeaderConfigProperty(initializer: CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.Builder.() -> Unit
    = {}): CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty =
    CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.builder().apply(initializer).build()
