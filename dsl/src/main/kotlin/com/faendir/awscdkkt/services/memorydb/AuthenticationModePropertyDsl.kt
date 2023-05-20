@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnUser

public
    fun authenticationModeProperty(initializer: CfnUser.AuthenticationModeProperty.Builder.() -> Unit):
    CfnUser.AuthenticationModeProperty =
    CfnUser.AuthenticationModeProperty.builder().apply(initializer).build()
