package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun vCpuCountRangeRequestProperty(initializer: CfnSpotFleet.VCpuCountRangeRequestProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.VCpuCountRangeRequestProperty =
    CfnSpotFleet.VCpuCountRangeRequestProperty.builder().apply(initializer).build()
