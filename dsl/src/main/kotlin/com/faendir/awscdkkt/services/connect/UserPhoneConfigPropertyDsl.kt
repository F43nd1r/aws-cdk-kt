package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnUser

@Generated
public fun userPhoneConfigProperty(initializer: CfnUser.UserPhoneConfigProperty.Builder.() -> Unit =
    {}): CfnUser.UserPhoneConfigProperty =
    CfnUser.UserPhoneConfigProperty.builder().apply(initializer).build()
