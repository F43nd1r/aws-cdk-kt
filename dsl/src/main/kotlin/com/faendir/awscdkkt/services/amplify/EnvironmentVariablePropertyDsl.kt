package com.faendir.awscdkkt.services.amplify

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.amplify.CfnBranch

@Generated
public
    fun environmentVariableProperty(initializer: CfnBranch.EnvironmentVariableProperty.Builder.() -> Unit
    = {}): CfnBranch.EnvironmentVariableProperty =
    CfnBranch.EnvironmentVariableProperty.builder().apply(initializer).build()
