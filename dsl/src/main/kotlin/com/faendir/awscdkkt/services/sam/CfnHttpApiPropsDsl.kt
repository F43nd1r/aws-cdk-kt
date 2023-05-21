package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApiProps

@Generated
public fun cfnHttpApiProps(initializer: CfnHttpApiProps.Builder.() -> Unit = {}): CfnHttpApiProps =
    CfnHttpApiProps.builder().apply(initializer).build()
