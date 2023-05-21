package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.CfnResourceProps

@Generated
public fun cfnResourceProps(initializer: CfnResourceProps.Builder.() -> Unit = {}): CfnResourceProps
    = CfnResourceProps.builder().apply(initializer).build()
