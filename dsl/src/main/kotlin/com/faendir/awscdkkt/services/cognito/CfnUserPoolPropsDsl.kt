package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPoolProps

@Generated
public fun cfnUserPoolProps(initializer: CfnUserPoolProps.Builder.() -> Unit = {}): CfnUserPoolProps
    = CfnUserPoolProps.builder().apply(initializer).build()
