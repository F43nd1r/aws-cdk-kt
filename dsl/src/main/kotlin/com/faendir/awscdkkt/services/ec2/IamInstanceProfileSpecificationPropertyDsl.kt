package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun iamInstanceProfileSpecificationProperty(initializer: CfnSpotFleet.IamInstanceProfileSpecificationProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.IamInstanceProfileSpecificationProperty =
    CfnSpotFleet.IamInstanceProfileSpecificationProperty.builder().apply(initializer).build()
