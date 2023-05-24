package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.AwsAuthProps
import software.constructs.Construct

@Generated
public fun Construct.awsAuth(id: String, props: AwsAuthProps): AwsAuth = AwsAuth(this, id, props)

@Generated
public fun Construct.awsAuth(
  id: String,
  props: AwsAuthProps,
  initializer: @AwsCdkDsl AwsAuth.() -> Unit,
): AwsAuth = AwsAuth(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAwsAuth(id: String, initializer: @AwsCdkDsl AwsAuth.Builder.() -> Unit):
    AwsAuth = AwsAuth.Builder.create(this, id).apply(initializer).build()
