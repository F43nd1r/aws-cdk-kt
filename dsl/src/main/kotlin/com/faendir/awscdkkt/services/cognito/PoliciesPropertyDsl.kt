package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun policiesProperty(initializer: CfnUserPool.PoliciesProperty.Builder.() -> Unit = {}):
    CfnUserPool.PoliciesProperty = CfnUserPool.PoliciesProperty.builder().apply(initializer).build()
