@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3objectlambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

public
    fun policyStatusProperty(initializer: CfnAccessPoint.PolicyStatusProperty.Builder.() -> Unit):
    CfnAccessPoint.PolicyStatusProperty =
    CfnAccessPoint.PolicyStatusProperty.builder().apply(initializer).build()
