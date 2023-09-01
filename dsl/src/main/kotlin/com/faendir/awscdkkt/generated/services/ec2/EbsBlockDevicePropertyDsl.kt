package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public fun buildEbsBlockDeviceProperty(initializer: @AwsCdkDsl
    CfnSpotFleet.EbsBlockDeviceProperty.Builder.() -> Unit = {}):
    CfnSpotFleet.EbsBlockDeviceProperty =
    CfnSpotFleet.EbsBlockDeviceProperty.Builder().apply(initializer).build()
