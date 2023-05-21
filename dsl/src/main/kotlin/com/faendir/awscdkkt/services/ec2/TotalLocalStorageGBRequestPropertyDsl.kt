package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun totalLocalStorageGBRequestProperty(initializer: CfnSpotFleet.TotalLocalStorageGBRequestProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.TotalLocalStorageGBRequestProperty =
    CfnSpotFleet.TotalLocalStorageGBRequestProperty.builder().apply(initializer).build()
