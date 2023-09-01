package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolTriggers

@Generated
public fun buildUserPoolTriggers(initializer: @AwsCdkDsl UserPoolTriggers.Builder.() -> Unit = {}):
    UserPoolTriggers = UserPoolTriggers.Builder().apply(initializer).build()
