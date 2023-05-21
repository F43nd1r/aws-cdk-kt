package com.faendir.awscdkkt.services.panorama

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps

@Generated
public fun cfnApplicationInstanceProps(initializer: CfnApplicationInstanceProps.Builder.() -> Unit =
    {}): CfnApplicationInstanceProps =
    CfnApplicationInstanceProps.builder().apply(initializer).build()
