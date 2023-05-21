package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnAddonProps

@Generated
public fun cfnAddonProps(initializer: CfnAddonProps.Builder.() -> Unit = {}): CfnAddonProps =
    CfnAddonProps.builder().apply(initializer).build()
