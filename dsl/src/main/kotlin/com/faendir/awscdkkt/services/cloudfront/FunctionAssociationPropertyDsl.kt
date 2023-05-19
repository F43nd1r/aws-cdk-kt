@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

public
    fun functionAssociationProperty(initializer: CfnDistribution.FunctionAssociationProperty.Builder.() -> Unit):
    CfnDistribution.FunctionAssociationProperty =
    CfnDistribution.FunctionAssociationProperty.builder().apply(initializer).build()
