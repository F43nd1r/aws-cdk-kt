package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnUser

@Generated
public fun policyProperty(initializer: CfnUser.PolicyProperty.Builder.() -> Unit = {}):
    CfnUser.PolicyProperty = CfnUser.PolicyProperty.builder().apply(initializer).build()
