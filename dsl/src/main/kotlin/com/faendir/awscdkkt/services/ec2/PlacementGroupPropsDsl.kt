package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PlacementGroupProps

@Generated
public fun placementGroupProps(initializer: PlacementGroupProps.Builder.() -> Unit = {}):
    PlacementGroupProps = PlacementGroupProps.builder().apply(initializer).build()
