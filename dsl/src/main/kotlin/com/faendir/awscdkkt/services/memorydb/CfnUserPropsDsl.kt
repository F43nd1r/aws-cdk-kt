package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnUserProps

@Generated
public fun cfnUserProps(initializer: CfnUserProps.Builder.() -> Unit = {}): CfnUserProps =
    CfnUserProps.builder().apply(initializer).build()
