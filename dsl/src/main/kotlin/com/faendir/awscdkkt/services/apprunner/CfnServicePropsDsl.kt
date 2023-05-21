package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnServiceProps

@Generated
public fun cfnServiceProps(initializer: CfnServiceProps.Builder.() -> Unit = {}): CfnServiceProps =
    CfnServiceProps.builder().apply(initializer).build()
