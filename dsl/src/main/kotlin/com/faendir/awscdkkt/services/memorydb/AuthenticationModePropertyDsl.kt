package com.faendir.awscdkkt.services.memorydb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.memorydb.CfnUser

@Generated
public
    fun authenticationModeProperty(initializer: CfnUser.AuthenticationModeProperty.Builder.() -> Unit
    = {}): CfnUser.AuthenticationModeProperty =
    CfnUser.AuthenticationModeProperty.builder().apply(initializer).build()
