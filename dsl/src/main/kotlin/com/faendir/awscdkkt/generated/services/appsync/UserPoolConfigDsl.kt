package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.UserPoolConfig

@Generated
public fun buildUserPoolConfig(initializer: @AwsCdkDsl UserPoolConfig.Builder.() -> Unit):
    UserPoolConfig = UserPoolConfig.Builder().apply(initializer).build()
