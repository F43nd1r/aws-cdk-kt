package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnIndexProps

@Generated
public fun cfnIndexProps(initializer: CfnIndexProps.Builder.() -> Unit = {}): CfnIndexProps =
    CfnIndexProps.builder().apply(initializer).build()
