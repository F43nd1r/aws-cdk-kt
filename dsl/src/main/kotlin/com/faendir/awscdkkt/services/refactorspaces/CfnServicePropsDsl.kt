package com.faendir.awscdkkt.services.refactorspaces

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.refactorspaces.CfnServiceProps

@Generated
public fun cfnServiceProps(initializer: CfnServiceProps.Builder.() -> Unit = {}): CfnServiceProps =
    CfnServiceProps.builder().apply(initializer).build()
