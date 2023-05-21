package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnCustomResourceProps

@Generated
public fun cfnCustomResourceProps(initializer: CfnCustomResourceProps.Builder.() -> Unit = {}):
    CfnCustomResourceProps = CfnCustomResourceProps.builder().apply(initializer).build()
