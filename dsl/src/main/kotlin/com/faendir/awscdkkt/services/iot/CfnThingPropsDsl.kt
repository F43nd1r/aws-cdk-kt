package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingProps

@Generated
public fun cfnThingProps(initializer: CfnThingProps.Builder.() -> Unit = {}): CfnThingProps =
    CfnThingProps.builder().apply(initializer).build()
