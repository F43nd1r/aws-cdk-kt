package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolClientOptions

@Generated
public fun buildUserPoolClientOptions(initializer: @AwsCdkDsl UserPoolClientOptions.Builder.() -> Unit = {}): UserPoolClientOptions = UserPoolClientOptions.Builder().apply(initializer).build()
