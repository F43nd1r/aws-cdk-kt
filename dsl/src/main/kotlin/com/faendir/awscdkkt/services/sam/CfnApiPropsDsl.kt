package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApiProps

@Generated
public fun cfnApiProps(initializer: CfnApiProps.Builder.() -> Unit = {}): CfnApiProps =
    CfnApiProps.builder().apply(initializer).build()
