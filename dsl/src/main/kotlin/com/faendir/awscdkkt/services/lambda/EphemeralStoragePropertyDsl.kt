package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnFunction

@Generated
public
    fun ephemeralStorageProperty(initializer: CfnFunction.EphemeralStorageProperty.Builder.() -> Unit
    = {}): CfnFunction.EphemeralStorageProperty =
    CfnFunction.EphemeralStorageProperty.builder().apply(initializer).build()
