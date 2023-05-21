package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnServiceProps

@Generated
public fun cfnServiceProps(initializer: CfnServiceProps.Builder.() -> Unit = {}): CfnServiceProps =
    CfnServiceProps.builder().apply(initializer).build()
