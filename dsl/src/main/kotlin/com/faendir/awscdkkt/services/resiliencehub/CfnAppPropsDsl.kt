package com.faendir.awscdkkt.services.resiliencehub

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.resiliencehub.CfnAppProps

@Generated
public fun cfnAppProps(initializer: CfnAppProps.Builder.() -> Unit = {}): CfnAppProps =
    CfnAppProps.builder().apply(initializer).build()
