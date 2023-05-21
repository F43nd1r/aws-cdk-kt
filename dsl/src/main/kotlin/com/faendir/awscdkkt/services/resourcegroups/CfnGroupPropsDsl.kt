package com.faendir.awscdkkt.services.resourcegroups

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.resourcegroups.CfnGroupProps

@Generated
public fun cfnGroupProps(initializer: CfnGroupProps.Builder.() -> Unit = {}): CfnGroupProps =
    CfnGroupProps.builder().apply(initializer).build()
