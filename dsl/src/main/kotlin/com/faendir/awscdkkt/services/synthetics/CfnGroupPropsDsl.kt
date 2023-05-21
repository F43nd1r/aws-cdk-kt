package com.faendir.awscdkkt.services.synthetics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnGroupProps

@Generated
public fun cfnGroupProps(initializer: CfnGroupProps.Builder.() -> Unit = {}): CfnGroupProps =
    CfnGroupProps.builder().apply(initializer).build()
