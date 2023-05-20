@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

public
    fun iamInstanceProfileSpecificationProperty(initializer: CfnSpotFleet.IamInstanceProfileSpecificationProperty.Builder.() -> Unit):
    CfnSpotFleet.IamInstanceProfileSpecificationProperty =
    CfnSpotFleet.IamInstanceProfileSpecificationProperty.builder().apply(initializer).build()
