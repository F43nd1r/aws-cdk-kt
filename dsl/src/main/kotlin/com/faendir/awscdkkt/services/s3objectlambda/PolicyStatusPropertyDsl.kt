package com.faendir.awscdkkt.services.s3objectlambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint

@Generated
public fun policyStatusProperty(initializer: CfnAccessPoint.PolicyStatusProperty.Builder.() -> Unit
    = {}): CfnAccessPoint.PolicyStatusProperty =
    CfnAccessPoint.PolicyStatusProperty.builder().apply(initializer).build()
