@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy

public
    fun policyStatusProperty(initializer: CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.Builder.() -> Unit):
    CfnMultiRegionAccessPointPolicy.PolicyStatusProperty =
    CfnMultiRegionAccessPointPolicy.PolicyStatusProperty.builder().apply(initializer).build()
