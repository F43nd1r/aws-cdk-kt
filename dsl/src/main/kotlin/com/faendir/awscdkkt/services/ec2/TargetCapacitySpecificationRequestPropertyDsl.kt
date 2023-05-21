package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@Generated
public
    fun targetCapacitySpecificationRequestProperty(initializer: CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.Builder.() -> Unit
    = {}): CfnEC2Fleet.TargetCapacitySpecificationRequestProperty =
    CfnEC2Fleet.TargetCapacitySpecificationRequestProperty.builder().apply(initializer).build()
