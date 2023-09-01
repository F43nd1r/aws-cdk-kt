package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnUser

@Generated
public fun buildUserPhoneConfigProperty(initializer: @AwsCdkDsl
    CfnUser.UserPhoneConfigProperty.Builder.() -> Unit = {}): CfnUser.UserPhoneConfigProperty =
    CfnUser.UserPhoneConfigProperty.Builder().apply(initializer).build()
