package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@Generated
public
    fun groupIdentifierProperty(initializer: CfnSpotFleet.GroupIdentifierProperty.Builder.() -> Unit
    = {}): CfnSpotFleet.GroupIdentifierProperty =
    CfnSpotFleet.GroupIdentifierProperty.builder().apply(initializer).build()
