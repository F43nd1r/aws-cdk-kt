package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@Generated
public
    fun functionAssociationProperty(initializer: CfnDistribution.FunctionAssociationProperty.Builder.() -> Unit
    = {}): CfnDistribution.FunctionAssociationProperty =
    CfnDistribution.FunctionAssociationProperty.builder().apply(initializer).build()
