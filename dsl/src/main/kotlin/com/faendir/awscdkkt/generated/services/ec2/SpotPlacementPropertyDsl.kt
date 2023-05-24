package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public fun buildSpotPlacementProperty(initializer: @AwsCdkDsl
    CfnSpotFleet.SpotPlacementProperty.Builder.() -> Unit): CfnSpotFleet.SpotPlacementProperty =
    CfnSpotFleet.SpotPlacementProperty.Builder().apply(initializer).build()
