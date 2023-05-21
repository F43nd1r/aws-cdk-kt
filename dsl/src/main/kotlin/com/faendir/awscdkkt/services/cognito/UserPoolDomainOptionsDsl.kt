package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolDomainOptions

@Generated
public fun userPoolDomainOptions(initializer: UserPoolDomainOptions.Builder.() -> Unit = {}):
    UserPoolDomainOptions = UserPoolDomainOptions.builder().apply(initializer).build()
