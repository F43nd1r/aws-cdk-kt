package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnUser

@Generated
public fun userIdentityInfoProperty(initializer: CfnUser.UserIdentityInfoProperty.Builder.() -> Unit
    = {}): CfnUser.UserIdentityInfoProperty =
    CfnUser.UserIdentityInfoProperty.builder().apply(initializer).build()
