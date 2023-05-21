package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnApplicationProps

@Generated
public fun cfnApplicationProps(initializer: CfnApplicationProps.Builder.() -> Unit = {}):
    CfnApplicationProps = CfnApplicationProps.builder().apply(initializer).build()
