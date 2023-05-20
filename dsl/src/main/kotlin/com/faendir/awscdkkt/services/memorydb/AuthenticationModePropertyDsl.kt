@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnUser

public
    fun authenticationModeProperty(initializer: CfnUser.AuthenticationModeProperty.Builder.() -> Unit):
    CfnUser.AuthenticationModeProperty =
    CfnUser.AuthenticationModeProperty.builder().apply(initializer).build()
