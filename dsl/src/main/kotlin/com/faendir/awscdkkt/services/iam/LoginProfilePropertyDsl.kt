package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnUser

@Generated
public fun loginProfileProperty(initializer: CfnUser.LoginProfileProperty.Builder.() -> Unit = {}):
    CfnUser.LoginProfileProperty = CfnUser.LoginProfileProperty.builder().apply(initializer).build()
