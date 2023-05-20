@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnUser

public
    fun userIdentityInfoProperty(initializer: CfnUser.UserIdentityInfoProperty.Builder.() -> Unit):
    CfnUser.UserIdentityInfoProperty =
    CfnUser.UserIdentityInfoProperty.builder().apply(initializer).build()
