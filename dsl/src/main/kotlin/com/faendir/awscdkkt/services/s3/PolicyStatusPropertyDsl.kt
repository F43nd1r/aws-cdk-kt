package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy

@Generated
public
    fun policyStatusProperty(initializer: CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.Builder.() -> Unit
    = {}): CfnMultiRegionAccessPointPolicy.PolicyStatusProperty =
    CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.builder().apply(initializer).build()
