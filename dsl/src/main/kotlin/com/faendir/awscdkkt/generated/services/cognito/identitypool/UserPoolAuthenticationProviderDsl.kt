package com.faendir.awscdkkt.generated.services.cognito.identitypool

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.identitypool.UserPoolAuthenticationProvider

@Generated
public fun buildUserPoolAuthenticationProvider(initializer: @AwsCdkDsl UserPoolAuthenticationProvider.Builder.() -> Unit = {}): UserPoolAuthenticationProvider = UserPoolAuthenticationProvider.Builder.create().apply(initializer).build()
