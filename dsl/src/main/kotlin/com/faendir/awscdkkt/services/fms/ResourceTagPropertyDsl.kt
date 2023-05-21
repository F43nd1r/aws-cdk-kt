package com.faendir.awscdkkt.services.fms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fms.CfnPolicy

@Generated
public fun resourceTagProperty(initializer: CfnPolicy.ResourceTagProperty.Builder.() -> Unit = {}):
    CfnPolicy.ResourceTagProperty =
    CfnPolicy.ResourceTagProperty.builder().apply(initializer).build()
