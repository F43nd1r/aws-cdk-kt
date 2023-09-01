package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.UserPoolDomain
import software.amazon.awscdk.services.cognito.UserPoolDomainProps
import software.constructs.Construct

@Generated
public fun Construct.userPoolDomain(
  id: String,
  props: UserPoolDomainProps,
  initializer: @AwsCdkDsl UserPoolDomain.() -> Unit = {},
): UserPoolDomain = UserPoolDomain(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUserPoolDomain(id: String, initializer: @AwsCdkDsl
    UserPoolDomain.Builder.() -> Unit = {}): UserPoolDomain = UserPoolDomain.Builder.create(this,
    id).apply(initializer).build()
